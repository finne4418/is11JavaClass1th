package chapter06;

public class Exam06_09_01 {
    public static void main(String[] args) {
        int[] h = { 4, 1, 6, 8, 3, 2, 9, 7, 5 };
        String result = "なし";
        int i = 0;

        System.out.print("探索する値を入力してください　>");
        int tk = new java.util.Scanner(System.in).nextInt();

        while(i < 9 && result.equals("なし")) {
            if (h[i] == tk) {
                result = "あり";
            } else {
                i++;
            }
        }
        System.out.println(result);
    }
}
