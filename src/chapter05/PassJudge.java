package chapter05;

import java.io.*;

public class PassJudge {
    public static void main(String[] args) throws IOException {
        final int GOKAKU_TEN = 50;

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String buf;

        System.out.println("終了は[Enter]だけを入力");
        System.out.print("点数入力>");
        while(!(buf = br.readLine()).equals("")) {
            int ten = Integer.parseInt(buf);
            String message = "";

            if (ten < GOKAKU_TEN) {
                int fusoku = GOKAKU_TEN - ten;
                message = "あと" + fusoku + "点で合格です";
            } else {
                message = "合格です";
            }
            System.out.println(message);
            System.out.print("点数入力>");
        }

    }
}
