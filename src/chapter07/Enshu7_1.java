import java.io.*;
public class Enshu7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        int hitNumber;
        int number;

        hitNumber = (int)(Math.random() * 100);
        System.out.println("�����Q�[��(0~99�܂ł̐����ł�)");
        System.out.println("����œ��Ă��邩���킵�Ă�������");

        while(true) {
            System.out.print("��:> ");
            number = Integer.parseInt(reader.readLine());

            if (hitNumber < number) {
                System.out.println(number + "��菬�����l�ł�");
            } else if (hitNumber > number) {
                System.out.println(number + "���傫���l�ł�");
            } else {
                System.out.println(number + "�œ�����ł�");
                break;
            }
        }
        System.out.println("--- �v���O�����I�� ---");
    }
}
