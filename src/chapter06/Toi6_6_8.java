package chapter06;

import java.util.*;

public class Toi6_6_8 {
    public static void main(String[] args) {
        int[] arrayTen1 = { 80, 90, -1, 76, 77, -1, 86, 75, 61, 73, 66 };
        List<Integer> arrayTen2 = new ArrayList<>();

        for (int anArrayTen1 : arrayTen1) {
            if (anArrayTen1 != -1) {
                arrayTen2.add(anArrayTen1);
            }
        }
        for (int i : arrayTen2) {
            System.out.print(i + " ");
        }
    }
}
