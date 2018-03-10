import java.util.*;
public class Exam07_03_01 {
    public static void main(String[] args) {
        String[] word = { "null", "eins", "zwei", "drei", "vier", "fuenf", "sechs", "sieben", "acht", "nuen", "zehn" };
        Scanner sc = new Scanner(System.in);
        System.out.print("0~10‚Ì”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        int number = sc.nextInt();
        if (number > 10) System.out.println("‚í‚©‚è‚Ü‚¹‚ñ");
        switch(number) {
            case 1:
                System.out.println(word[number]);
                break;
            case 2:
                System.out.println(word[number]);
                break;
            case 3:
                System.out.println(word[number]);
                break;
            case 4:
                System.out.println(word[number]);
                break;
            case 5:
                System.out.println(word[number]);
                break;
            case 6:
                System.out.println(word[number]);
                break;
            case 7:
                System.out.println(word[number]);
                break;
            case 8:
                System.out.println(word[number]);
                break;
            case 9:
                System.out.println(word[number]);
                break;
            case 10:
                System.out.println(word[number]);
                break;
        }
    }
}
