package chapter09;

public class Exam09_03_01 {
    public static void main(String[] args) {
        int[] num = new int[3];

        try {
            for (int i = 0; i <= num.length; i++ ) {
                num[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("不正な配列参照が発生しました");
        }
    }
}
