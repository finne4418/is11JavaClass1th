package chapter11;

public class Practice1_1 {
    public static void main(String[] args) {
        int[] arrayMark = { 90, 75, 100, 60, 95, 70, 85, 80, 90, 80 };
        int[] arrayRank = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        int i;
        for (i = 0; i < arrayMark.length; i++ ) {
            for (int j = 0; j < arrayRank.length; j++ ) {
                if (arrayMark[i] < arrayMark[j]) {
                    arrayRank[i]++;
                }
            }
        }

        i = 0;
        while (i < arrayMark.length) {
            System.out.println((i + 1) + "人目\t" + arrayMark[i] + "点\t"
                                    + arrayRank[i] + "位");
            i++;
        }
    }
}
