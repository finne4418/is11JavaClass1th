package chapter06;

public class Exam06_09_02 {
    public static void main(String[] args) {
        int[] h = { 4, 1, 6, 8, 3, 2, 9, 7, 5 };
        String result = "なし";
        int i = 0;

        System.out.print("探索する値を入力してください　>");
        int tk = new java.util.Scanner(System.in).nextInt();

        while(i < 9) {
            if (h[i] == tk) {
                result = (i + 1) + "番目にあります";
                break;
            } else {
                i++;
            }
        }
        System.out.println(result);
    }
}
