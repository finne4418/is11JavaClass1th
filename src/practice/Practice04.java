public class Practice04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0");
        int number1 = 1;
        int number2 = 1;
        while(number1 < 1000) {
            sb.append("," + number1);
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
        System.out.println(sb.toString());
    }
}
