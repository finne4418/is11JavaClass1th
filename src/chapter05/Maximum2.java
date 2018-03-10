package chapter05;

import java.util.*;

public class Maximum2 {
    public static void main(String[] args) {
        String[] numName = {"x", "y", "z"};
        int[] numbers = new int[numName.length];
        final String MAX_MESSAGE = "最大値は";

        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(i < numName.length) {
            System.out.print(numName[i] + "を入力>");
            numbers[i] = sc.nextInt();
            i++;
        }
        int maxValue = numbers[0];
        if (maxValue < numbers[1]) {
            maxValue = numbers[1];
        }
        if (maxValue < numbers[2]) {
            maxValue = numbers[2];
        }
        System.out.println(MAX_MESSAGE + maxValue);
    }
}
