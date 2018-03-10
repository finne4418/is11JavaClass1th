package practice;

import java.util.*;
public class Practice09 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.print("メールアドレスを入力してください > ");
        String address = sc.nextLine();

        int i = 0;
        int index = 0;
        int mark_number = 0;
        while(i < address.length()) {
            Character c = address.charAt(i);
            if (c.equals('@')) {
                index = i;
                mark_number++;
            }
            i++;
        }
        if (mark_number != 1) {
            System.out.println("メールアドレスではありません");
            System.exit(1);
        }
        for (i = 0; i < index; i++ ) {
            sb.append(address.charAt(i));
        }
        System.out.println("アカウント名: " + sb.toString());

        sb.setLength(0);
        for (int j = index + 1; j < address.length(); j++ ) {
            sb.append(address.charAt(j));
        }
        System.out.println("ドメイン名: " + sb.toString());
    }
}
