import java.io.*;
public class Enshu7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        int hitNumber;
        int number;

        hitNumber = (int)(Math.random() * 100);
        System.out.println("数宛ゲーム(0~99までの数字です)");
        System.out.println("何回で当てられるか挑戦してください");

        while(true) {
            System.out.print("数:> ");
            number = Integer.parseInt(reader.readLine());

            if (hitNumber < number) {
                System.out.println(number + "より小さい値です");
            } else if (hitNumber > number) {
                System.out.println(number + "より大きい値です");
            } else {
                System.out.println(number + "で当たりです");
                break;
            }
        }
        System.out.println("--- プログラム終了 ---");
    }
}
