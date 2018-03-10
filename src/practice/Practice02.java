package practice;

public class Practice02 {
    public static void main(String[] args) {
        int[] a = { 65, 37, 48, 92, 37, 54, 20, 65, 37, 81 };
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++ ) {
            b[i] = 1;
        }
        for (int i = 0; i < a.length - 1; i++ ) {
            for (int j = i + 1; j < a.length; j++ ) {
                if (a[i] < a[j]) {
                    b[i] += 1;
                } else {
                    b[j] += 1;
                }
            }
        }
        for (int i = 0; i < a.length; i++ ) {
            System.out.println("[" + i + "]:" + a[i] + "点 " + b[i] + "位");
        }
    }
}
