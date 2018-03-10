package chapter06;

public class Exam06_09_05 {
    public static void main(String[] args) {
        int[] a = { 5, 2, 7, 1, 4 };
        int n = a.length;

        System.out.print("ソート前 > ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        while(n > 1) {
            for (int i = 0; i < n - 1; i++ ) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
            n--;
        }
        System.out.print("ソート後 > ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
