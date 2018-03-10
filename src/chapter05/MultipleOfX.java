package chapter05;

import java.util.*;

public class MultipleOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        String buf;

        System.out.println("終了は[Enter]だけを入力");
        System.out.print("整数入力>");
        while(!(buf = sc.nextLine()).equals("")) {
            int num = Integer.parseInt(buf);

            if ((num % x) == 0) {
                System.out.println(num + "は" + x + "の倍数です");
            } else {
                System.out.println(num + "は" + x + "の倍数ではありません");
            }
            System.out.print("整数入力>");
        }
    }
}
