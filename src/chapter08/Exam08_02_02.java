package chapter08;

import java.util.Scanner;

public class Exam08_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数１を入力してください\n> ");
        int num1 = sc.nextInt();
        System.out.print("整数２を入力してください\n> ");
        int num2 = sc.nextInt();
        System.out.println(Math.max(num1, num2) + "の方が大きいです");
    }
}
