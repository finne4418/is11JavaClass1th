package practice;

import java.util.*;

public class Practice06 {
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        while(i < 4) {
            int number = random.nextInt(9) + 1;
            while(!numberCheck(number)) {
                number = random.nextInt(10);
            }
            numbers.add(number);
            i++;
        }
        for (int num : numbers) {
            System.out.print(num);
        }
    }
    private static boolean numberCheck(int number) {
        for (int i : numbers) {
            if (number == i) {
                return false;
            }
        }
        return true;
    }
}
