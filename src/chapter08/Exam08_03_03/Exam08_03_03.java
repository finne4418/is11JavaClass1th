package chapter08.Exam08_03_03;

import java.util.Scanner;

public class Exam08_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("月を入力してください > ");
        new Translation().jpLocalize(sc.nextInt());
    }
}
