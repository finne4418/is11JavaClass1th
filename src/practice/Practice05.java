public class Practice05 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0");
        int number1 = 0;
        int number2 = 1;
        int number3 = 1;
        while(number1 < 1000) {
            sb.append("," + number1);
            int sum = number1 + number2 + number3;
            number1 = number2;
            number2 = number3;
            number3 = sum;
        }
        System.out.println(sb.toString());
    }
}
