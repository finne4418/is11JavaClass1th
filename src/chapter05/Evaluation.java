package chapter05;

import java.io.*;

public class Evaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String buf;

        System.out.println("終了は[Enter]だけを入力");
        System.out.print("点数入力>");
        while(!(buf = br.readLine()).equals("")) {
            int ten = Integer.parseInt(buf);
            String message = "評価";

            if (0 <= ten && ten <= 100) {
                if (ten < 40) {
                    message += "C";
                } else if (ten < 70) {
                    message += "B";
                } else {
                    message += "A";
                }
            } else {
                message = "範囲外の値ERROR: 0から100までの数を入力してください";
            }
            System.out.println(message);
            System.out.print("点数入力>");
        }
    }
}
