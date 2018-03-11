package chapter11.Practice5_1;

import chapter11.input.InputNotIntegerException;
import chapter11.input.InputScanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Practice5_1 {
    private InputScanner is = new InputScanner();
    private TestRecord[] records;

    public static void main(String[] args) {
        Practice5_1 p = new Practice5_1();
        p.start();
    }

    private void start() {
        int record_num = inputRecord_num();
        records = new TestRecord[record_num];

        inputTestRecords();

        Arrays.sort(records, TestRecord.getSorter());

        System.out.print("ファイル名を入力してください > ");
        String fileName = is.input();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (TestRecord record : records) {
                writer.write(record.getCSV() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("入出力エラーです");
            System.exit(1);
        }
    }

    private int inputRecord_num() {
        while (true) {
            try {
                int record_num = is.inputInt("入力データ件数を入力してください(1~100) > ");
                rangeCheck(record_num);
                return record_num;
            }
            catch (InputNotIntegerException e) {
                printErrMsg("入力が整数ではありません");
            }
            catch (RangeOverException e) {
                printErrMsg("入力件数が不正です\n1 ~ 100までの数値で入力してください");
            }
        }
    }

    private static void rangeCheck(int record_num) {
        if (record_num <= 0 || record_num > 100) {
            throw new RangeOverException();
        }
    }

    private void inputTestRecords() {
        for (int i = 0; i < records.length; i++) {
            while (true) {
                try {
                    System.out.print("学籍番号、氏名、試験点数をスペース区切りで入力してください\n> ");
                    String info = is.input();

                    checkInfo(info);

                    records[i] = createTestRecord(info);
                    break;
                }
                catch (ScoreRangeOverException e) {
                    printErrMsg("点数は0~100までの数値で入力してください");
                }
                catch (RangeOverException e) {
                    printErrMsg("学籍番号は7桁以内の数値で入力してください");
                }
                catch (IllegalNameLengthException e) {
                    printErrMsg("氏名は16文字以内で入力してください");
                }
                catch (IllegalFormatException e) {
                    printErrMsg("入力されたフォーマットが正しくありません");
                }
            }
        }
    }

    private void checkInfo(String info) {
        String[] infos = info.split(" ");
        if (infos.length != 3) {
            throw new IllegalFormatException();
        }
        int number = Integer.parseInt(infos[0]);
        String name = infos[1];
        int score = Integer.parseInt(infos[2]);

        if (number < 0 || number >= 10000000) {
            throw new RangeOverException();
        }
        if (name.length() > 16) {
            throw new IllegalNameLengthException();
        }
        if (score < 0 || score > 100) {
            throw new ScoreRangeOverException();
        }
    }

    private static TestRecord createTestRecord(String info) {
        String[] infos = info.split(" ");
        int number = Integer.parseInt(infos[0]);
        String name = infos[1];
        int score = Integer.parseInt(infos[2]);

        return new TestRecord(number, name, score);
    }

    private void printErrMsg(String msg) {
        System.out.println("---- error ----");
        System.out.println(msg);
        System.out.println("---------------");

    }
}

class RangeOverException extends RuntimeException {
    RangeOverException() {
        super("out of range");
    }
    RangeOverException(String msg) {
        super(msg);
    }
}

class IllegalNameLengthException extends RuntimeException {
    IllegalNameLengthException() {
        super("out of name length");
    }
}

class ScoreRangeOverException extends RangeOverException {
    ScoreRangeOverException() {
        super("out of range of score");
    }
}

class IllegalFormatException extends RuntimeException {
    IllegalFormatException() {
        super("IllegalFormat");
    }
}
