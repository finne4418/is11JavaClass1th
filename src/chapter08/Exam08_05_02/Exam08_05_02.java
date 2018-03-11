package chapter08.Exam08_05_02;

import java.util.Scanner;

public class Exam08_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列を入力してください > ");
        String text = sc.nextLine();

        System.out.print("検索する文字を入力してください > ");
        char ch = sc.nextLine().charAt(0);

        int num = new Moji().count(text, ch);
        if (num == 0)
            System.out.println(text + " に " + ch + " は含まれていません");
        else
            System.out.println(text + " に " + ch + " は " + num + " 文字含まれています");
    }
}
