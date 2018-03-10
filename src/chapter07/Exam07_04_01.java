import java.util.*;
public class Exam07_04_01 {
    public static void main(String[] args) {
        System.out.println("サイコロを振ります");
        int number = new Random().nextInt(6) + 1;
        System.out.println(number + "が出ました");
    }
}
