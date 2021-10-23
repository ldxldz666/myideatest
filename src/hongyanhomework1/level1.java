package hongyanhomework1;

public class level1 {
    public static void main(String[] args) {
//99乘法表

        for (int i = 1; i <= 9; i++) {
            for (int o = 1; o <= i; o++) {
                int a = i * o;
                System.out.print(i + "*" + o + "=" + a + "\t");
            }
            System.out.println();

        }


        //打印星星


        int touHigh = 6;
        int jianHigh = 25;
        int kuang = 50;
        for (int i = 1; i <= touHigh + jianHigh; i++) {
            for (int j = 1; j <= kuang; j++) {
                //上三角
                if (i <= touHigh) {
                    if (j >= (kuang / 2 + 1) + 1 - i && j <= (kuang / 2 + 1) - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
                //上三角一下部分
                if (i > touHigh && i <= jianHigh) {
                    if (j >= (kuang / 2 + 1) + 2 - i && j <= kuang - 3 * (i - touHigh)) {
                        System.out.print("*");
                    } else if (j < (kuang / 2 + 1) - 3 + i && j >= 3 * (i - touHigh)) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println("");
        }
    }
}






















