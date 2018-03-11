package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam10_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ファイル名を入力してください > ");
        String fileName = sc.nextLine();

        try (BufferedReader reader =
                    new BufferedReader(new FileReader(fileName))) {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
