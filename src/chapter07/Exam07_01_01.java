import java.util.*;

public class Exam07_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int counter = 0;
        do {
            StringBuilder sb = new StringBuilder();
            int divisor = 0;
            System.out.print("��������͂��Ă������� > ");
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("�v���O�������I�����܂�");
                System.exit(1);
            }
            sb.append(number + "�̖񐔂�1");
            for (int i = 2; i <= number; i++ ) {
                if (number % i == 0) sb.append("," + i);
            }
            sb.append("�ł�");
            System.out.println(sb.toString() + "\n");
            counter++;
        } while(true);
    }
}
