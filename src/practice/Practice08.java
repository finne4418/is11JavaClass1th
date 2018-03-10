package practice;

import java.util.*;

public class Practice08 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();

        System.out.print("文字列を入力してください > ");
        String input = sc.nextLine();
        for (int i = input.length() - 1; i >= 0; i-- ) {
            Character c = input.charAt(i);
            sb.append(c.toString());
        }
        System.out.println(sb.toString());
    }
}
