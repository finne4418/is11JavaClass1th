import java.util.*;

public class Exam07_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        do {
            System.out.print("ŒŽ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
            month = sc.nextInt();
            if (month > 0 && month < 13) break;
            System.out.println("‚»‚ÌŒŽ‚Í‘¶Ý‚µ‚Ü‚¹‚ñB\n");
        } while (true);

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("t‚Å‚·");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("‰Ä‚Å‚·");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("H‚Å‚·");
                break;
            default:
                System.out.println("“~‚Å‚·");
        }
    }
}
