package chapter08;

import java.util.Scanner;

public class Exam08_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください\n> ");
        int input = sc.nextInt();
        System.out.println("絶対値は" + Math.abs(input) + "です");
    }
}
