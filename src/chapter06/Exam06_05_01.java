package chapter06;

import java.util.Scanner;

public class Exam06_05_01 {
    private static final int SIZE = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[SIZE];

        for (int i = 0; i < num.length; i++ ) {
            System.out.print("整数" + (i + 1) + "を入力してください > ");
            num[i] = sc.nextInt();
        }
        System.out.println("平均値は" + sum(num, 0) / (double) num.length + "です");
    }

    // ネットで繰り返し処理を使わない配列の要素の合計の出し方があって、面白かったので採用
    // くっっっっっっそ読みにくいから実際には使わないよこんなのｗｗｗｗｗｗｗｗｗ
    private static int sum(int[] array, int index) {
        return index < array.length ? array[index] + sum(array, index + 1) : 0;
    }
}
