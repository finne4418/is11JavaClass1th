import java.io.*;

public class Toi7_2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        int[] arrayKijun = { 80, 65, 50, 0 };
        String[] arrayHyoka = { "優", "良", "可", "不可" };
        int i;

        System.out.print("点数(0-100)>");
        int tensu = Integer.parseInt(reader.readLine());

        for (i = 0; i < arrayKijun.length; i++ ) {
            if (arrayKijun[i] < tensu) {
                break;
            }
        }
        System.out.println(arrayHyoka[i]);
    }
}
