package chapter06;

public class Exam06_09_06 {
    public static void main(String[] args) {
        int[] numbers = { 56, 9, 62, 37, 25, 68, 43 };

        for (int i = 0; i < numbers.length - 1; i++ ) {
            for (int j = i + 1; j < numbers.length; j++ ) {
                if (numbers[i] < numbers[j]) {
                    int work = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = work;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + ",");
        }
    }
}
