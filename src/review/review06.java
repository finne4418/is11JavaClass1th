package review;

import java.util.Scanner;

public class review06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("何回ループしますか");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++ ) {
            System.out.println(i + "回目のループです");
        }
    }
}
