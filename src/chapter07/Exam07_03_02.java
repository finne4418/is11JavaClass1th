import java.util.*;

public class Exam07_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        do {
            System.out.print("������͂��Ă������� > ");
            month = sc.nextInt();
            if (month > 0 && month < 13) break;
            System.out.println("���̌��͑��݂��܂���B\n");
        } while (true);

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("�t�ł�");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("�Ăł�");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�H�ł�");
                break;
            default:
                System.out.println("�~�ł�");
        }
    }
}
