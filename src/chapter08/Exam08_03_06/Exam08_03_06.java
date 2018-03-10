package chapter08.Exam08_03_06;

import java.util.Scanner;

public class Exam08_03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("点数を入力してください > ");
        int score = sc.nextInt();

        if (new Check().checkNumber(score) == 1)
            System.out.println("範囲外です");
        else {
            char result = new Test().judge(score);
            System.out.println("評価は" + result + "です");
        }
    }
}
