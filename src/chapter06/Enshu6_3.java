package chapter06;

public class Enshu6_3 {
    public static void main(String[] args) {
        int[] arrayNyujo = { 856, 861, 862, 854, 864, 846, 848 };

        int min = arrayNyujo[0];
        for (int i = 1; i < arrayNyujo.length; i++ ) {
            min = Math.min(min, arrayNyujo[i]);
        }
        System.out.println("最小 = " + min);
    }
}
