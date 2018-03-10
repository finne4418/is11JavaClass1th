package practice;

import java.util.*;

public class Practice01 {
    public static void main(String[] args) {
        int[] s = { 4, 8, 5, 1, 7 };
        List<Integer> numbers = new ArrayList<>();

        numbers.add(s[0]);
        for (int i = 1; i < s.length; i++ ) {
            boolean flag = false;
            for (int j = 0; j < numbers.size(); j++ ) {
                if (numbers.get(j) > s[i]) {
                    numbers.add(j, s[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                numbers.add(s[i]);
            }
        }
    }
}
