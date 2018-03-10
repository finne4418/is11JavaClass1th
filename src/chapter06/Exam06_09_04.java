package chapter06;

public class Exam06_09_04 {
    public static void main(String[] args) {
        int[] h = { 12, 13, 17, 19, 21, 25, 33, 34, 36 };
        int lo = 0;
        int hi = h.length - 1;
        int found = -1;

        System.out.print("探索する値を入力してください　>");
        int tk = new java.util.Scanner(System.in).nextInt();

        while(lo <= hi && found == -1) {
            int i = (lo + hi) / 2;
            if (h[i] < tk) {
                lo = i + 1;
            } else if (h[i] > tk) {
                hi = i - 1;
            } else {
                found = i;
            }
        }
        String result = "なし";
        if (found >= 0) {
            result = "あり";
        } else {
            result = "なし";
        }
        System.out.println(result);

    }
}
