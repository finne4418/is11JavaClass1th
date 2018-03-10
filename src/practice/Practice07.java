import java.util.*;
import java.util.stream.*;

class Practice06 {
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
    public static boolean numberCheck(int number) {
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
        int[] answer = Practice06.createNumber();

        int i = 1;
        while(true) {
            System.out.print(i + "‰ñ–Ú: 4Œ…‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
            String number = sc.nextLine();
            String[] numbers = number.split("");
            int[] numbers = Arrays.stream(numbers).mapToInt(x -> Integer.parseInt(x)).toArray();

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
                System.out.println("³‰ğ‚Å‚·!");
                System.exit(0);
            }
        }
    }
}
