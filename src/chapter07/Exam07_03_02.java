import java.util.*;

public class Exam07_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        do {
            System.out.print("月を入力してください > ");
            month = sc.nextInt();
            if (month > 0 && month < 13) break;
            System.out.println("その月は存在しません。\n");
        } while (true);

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春です");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏です");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋です");
                break;
            default:
                System.out.println("冬です");
        }
    }
}
