package review;

import java.util.Scanner;

public class review04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int INPUT_NUMBER = 3;
        double sum = 0;

        for (int i = 1; i <= INPUT_NUMBER; i++ ) {
            System.out.println("整数" + i + "を入力してください");
            sum += sc.nextInt();
        }
        System.out.println("平均値は" + (sum / INPUT_NUMBER));
    }
}
