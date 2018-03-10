package chapter08.Exam08_03_02;

import java.util.Scanner;

public class Exam08_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("底辺を入力してください > ");
        int base = sc.nextInt();
        System.out.print("高さを入力してください > ");
        int high = sc.nextInt();

        double area = new Area().triangle(base, high);
        errorCheck(area);
        System.out.println("三角形の面積は" + area + "です");
    }

    private static void errorCheck(double area) {
        if (area >= 0) return;
        if (area == -1) System.out.println("底辺は1以上を入力してください");
        if (area == -2) System.out.println("高さを1以上を入力してください");
        if (area == -3) System.out.println("底辺・高さは1以上を入力してください");
        System.exit(1);
    }
}
