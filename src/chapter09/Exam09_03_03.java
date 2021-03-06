import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam09_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        int num;

        System.out.print("金額を入力してください > ");
        try {
            money = check(sc.nextInt());
        }
        catch (InputMismatchException e) {
            System.out.println("金額に整数以外が入力されました");
            return;
        }
        catch (ValueOfMinusException e) {
            System.out.println("金額に０以下の値が入力されました");
            return;
        }

        System.out.print("人数を入力してください > ");
        try {
            num = check(sc.nextInt());
        }
        catch (InputMismatchException e) {
            System.out.println("人数に整数以外が入力されました");
            return;
        }
        catch (ValueOfMinusException e) {
            System.out.println("人数に０以下の値が入力されました");
            return;
        }

        int price = money / num;
        int rem = money % num;

        System.out.println((num - rem) + "名 : " + price + "円のお支払い");
        if (rem > 0) {
            System.out.println(rem + "名 : " + (price + 1) + "円のお支払い");
        }
    }

    private static int check(int num) {
        if (num <= 0)
            throw new ValueOfMinusException();
        return num;
    }
}

class ValueOfMinusException extends RuntimeException {
    ValueOfMinusException() {
        super("Negative value specified");
    }
}
