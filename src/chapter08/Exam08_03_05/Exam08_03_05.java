package chapter08.Exam08_03_05;

import java.util.Scanner;

public class Exam08_03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("苗字を入力してください > ");
        String name = sc.nextLine();

        int number = new NameData().searchFamilyName(name);
        if (number == 0) {
            System.out.println(name + "という苗字は日本に存在しません");
        } else {
            System.out.println(name + "さんは全国に" + number + "人います");
        }
    }
}
