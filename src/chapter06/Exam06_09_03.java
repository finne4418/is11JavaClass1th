package chapter06;

public class Exam06_09_03 {
    public static void main(String[] args) {
        int[] h = { 4, 1, 6, 8, 3, 2, 9, 7, 5, 0 };
        String result = "なし";
        int i = 0;

        System.out.print("探索する値を入力してください　>");
        int tk = new java.util.Scanner(System.in).nextInt();
        h[h.length - 1] = tk;
        while(tk != h[i]) {
            i++;
        }
        if (i < h.length - 1) {
            result = "あり";
        }
        System.out.println(result);
    }
}
