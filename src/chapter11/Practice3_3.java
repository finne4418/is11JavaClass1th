package chapter11;

public class Practice3_3 {
    public static void main(String[] args) {
        int[] arrayScode = { 102, 800, 201, 101, 283, 430, 181, 550 };
        String[] arraySname = { "事務机B型", "応接机", "会議用机", "事務机A型"
                                , "折り畳み机", "木製机", "脇机", "学生机" };
        int i, j;
        boolean sortFlag;
        int tempCode;
        String tempName;

        i = 0;
        while (i < arrayScode.length - 1) {
            sortFlag = true;
            j = arrayScode.length - 1;

            while (i < j) {
                if (arrayScode[j - 1] > arrayScode[j]) {
                    tempCode = arrayScode[j];
                    tempName = arraySname[j];
                    arrayScode[j] = arrayScode[j - 1];
                    arraySname[j] = arraySname[j - 1];
                    arrayScode[j - 1] = tempCode;
                    arraySname[j - 1] = tempName;
                    sortFlag = false;
                }
                j--;
            }
            if (sortFlag)
                break;

            i++;
        }

        i = 0;
        while (i < arrayScode.length) {
            System.out.println(arrayScode[i] + "\t" + arraySname[i]);
            i++;
        }
    }
}
