package chapter06;

public class Exam06_09_07 {
    public static void main(String[] args) {
        char[] a = { '2', '7', '4' };
        char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        int num = 0;
        for (char anA : a) {
            int j = 0;
            while (anA > c[j]) {
                j++;
            }
            num = num * 10 + j;
        }
    }
}
