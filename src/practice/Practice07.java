package practice;

import java.util.*;

class NumberProvider {
    private static int[] numbers = new int[4];

    public static int[] createNumber() {
        Random random = new Random();
        int i = 0;
        while(i < 4) {
            int number = random.nextInt(9) + 1;
            while(!numberCheck(number)) {
                number = random.nextInt(10);
            }
            numbers[i] = number;
            i++;
        }
        return numbers;
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

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = NumberProvider.createNumber();

        int i = 1;
        while(true) {
            System.out.print(i + "回目: 4桁の整数を入力してください > ");
            String number = sc.nextLine();
            String[] numbersStr = number.split("");
            int[] numbers = Arrays.stream(numbersStr).mapToInt(Integer::parseInt).toArray();

            int hit = 0;
            int blow = 0;

            for (int j = 0; j < answer.length; j++ ) {
                for (int k = 0; k < numbers.length; k++ ) {
                    if (answer[j] == numbers[k]) {
                        if (j == k) hit++;
                        if (j != k) blow++;
                    }
                }
            }
            System.out.println(hit + "hit / " + blow + "blow");
            if (hit == 4) {
                System.out.println("正解!");
                System.exit(0);
            }
        }
    }
}
