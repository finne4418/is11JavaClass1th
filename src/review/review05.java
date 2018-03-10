package review;

import java.util.Scanner;

public class review05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("何回ループしますか");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            System.out.println(i + "回目のループです");
            i++;
        }
    }
}
