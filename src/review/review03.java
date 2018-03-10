package review;

import java.util.Scanner;

public class review03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.println("苗字を入力してください");
        sb.append(sc.nextLine());
        System.out.println("名前を入力してください");
        sb.append(sc.nextLine());

        System.out.println(sb.toString() + "さんですね");
    }
}
