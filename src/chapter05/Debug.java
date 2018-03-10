package chapter05;

import java.io.*;

public class Debug {
    public static void main(String[] args) throws IOException {
        final int TSUJO_RYOKIN = 2000;
        final String FEMALE = "F";

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("年齢>");
        int nenrei = Integer.parseInt(br.readLine());

        System.out.println("男性はM　女性はFを入力してください");
        System.out.print("性別>");
        String seibetsu = br.readLine();

        int ryokin = TSUJO_RYOKIN;

        if (nenrei < 18) {
            ryokin /= 2;
        }
        if (seibetsu.equals(FEMALE)) {
            ryokin /= 2;
        }
        System.out.println("入場料は" + ryokin + "円です");
    }
}
