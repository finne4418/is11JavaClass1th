package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum {
    public static void main(String[] args) throws IOException {
        final String MIN_MESSAGE = "最小値は";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("xを入力>");
        int x = Integer.parseInt(br.readLine());
        System.out.print("yを入力>");
        int y = Integer.parseInt(br.readLine());
        System.out.print("zを入力>");
        int z = Integer.parseInt(br.readLine());

        int minValue = x;

        if (minValue > y) {
            minValue = y;
        }
        if (minValue > z) {
            minValue = z;
        }

        System.out.println(MIN_MESSAGE + minValue);
    }
}
