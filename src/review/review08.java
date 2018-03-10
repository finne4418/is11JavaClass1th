package review;

import java.util.Scanner;

public class review08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("時刻を入力してください");
        int time = sc.nextInt();

        if (time >= 0 && time < 12) {
            System.out.println("午前" + time + "時です");
        }
        else if (time >= 12 && time < 24) {
            System.out.println("午後" + (time - 12) + "時です");
        }
        else {
            System.err.println("0~23の時刻を入力してください");
        }
    }
}
