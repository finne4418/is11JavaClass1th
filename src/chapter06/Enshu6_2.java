package chapter06;

public class Enshu6_2 {
    public static void main(String[] args) {
        int[][] arrayTensu = {{95, 70, 85, 85},
                              {90, 70, 80, 90},
                              {90, 65, 80, 80}};

        double[] kamokuHeikin = new double[arrayTensu[0].length];
        int kamokugokei;

        for (int i = 0; i < arrayTensu[0].length; i++ ) {
            kamokugokei = 0;
            for (int j = 0; j < arrayTensu.length; j++ ) {
                kamokugokei += arrayTensu[j][i];
            }
            kamokuHeikin[i] = (double)kamokugokei / arrayTensu.length;
        }
        for (double aKamokuHeikin : kamokuHeikin) {
            System.out.println(aKamokuHeikin);
        }
    }
}
