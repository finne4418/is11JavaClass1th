package chapter08.Exam08_05_01;

import java.util.Scanner;

public class Exam08_05_01 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ){
            System.out.print("整数" + (i + 1) + "を入力してください > ");
            numbers[i] = sc.nextInt();
        }
        int max = new Compare().max(numbers);
        System.out.println("最大値は" + max + "です");
    }
}
