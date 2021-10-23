package hongyanhomework0;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class level2 {

    /**
     * Lv2作业
     */
    public static void lv2() {
        Scanner in = new Scanner(System.in);

        while (true) {
            // 输入n和k的值
            System.out.println("请分别输入n和k的值");
            int n = in.nextInt();
            int k = in.nextInt();

            // 输入错误，重新输入
            if (n <= 0 || k <= 0) {
                System.out.println("n与k的值必须大于0，请重新输入");
                continue;
            }

            // 计算抽取的所有可能性
            int possibilities = 1;
            for (int i = 1; i <= k; i++)
                possibilities = possibilities * (n - i + 1) / i;

            // 输出最终结果
            System.out.printf("中奖概率为%.10f", 1.0 / possibilities);

            // 判断是否重新再来一遍
            boolean isExit = false;
            while (true) {
                System.out.println("是否再玩一次？输入yes再来一次，输入no退出程序");
                String isPlayAgain = in.next();
                if ("yes".equals(isPlayAgain)) {
                    // 继续执行
                    // isExit = false;
                    break;
                } else if ("no".equals(isPlayAgain)) {
                    // 退出循环
                    isExit = true;
                    break;
                } else {
                    // 重新输入
                    System.out.println("输入错误，请重新输入yes或no");
                }
            }

            // 通过isExit判断是否退出循环
            if (isExit) break;

        }
    }

    /**
     * Lv2进阶版
     * 解决数字太大的问题
     */
    public static void lv2_plus() {
        Scanner in = new Scanner(System.in);

        while (true) {
            // 输入n和k的值
            System.out.println("请分别输入n和k的值");
            int n = in.nextInt();
            int k = in.nextInt();

            // 输入错误，重新输入
            if (n <= 0 || k <= 0) {
                System.out.println("n与k的值必须大于0，请重新输入");
                continue;
            }

            // 计算抽取的所有可能性 使用BigInteger代替Int
            BigDecimal possibilities = BigDecimal.valueOf(1); // 值为1
            for (int i = 1; i <= k; i++) {
                BigDecimal param = BigDecimal.valueOf(n - i + 1); // 值为 n-i+1
                possibilities = possibilities.multiply(param); // 值为poss*(n-i+1)
                // 第二个参数表示保留位数，第三个参数RoundingMode.HALF_UP表示四舍五入，如果为2.35则结果为2.4
                possibilities = possibilities.divide(BigDecimal.valueOf(i), 20, RoundingMode.HALF_UP); // 值为poss*(n-i+1)/i
            }

            // 输出最终结果
            System.out.println("中奖概率为" + BigDecimal.valueOf(1).divide(possibilities, 20, RoundingMode.HALF_UP));

            // 判断是否重新再来一遍
            boolean isExit = false;
            while (true) {
                System.out.println("是否再玩一次？输入yes再来一次，输入no退出程序");
                String isPlayAgain = in.next();
                if ("yes".equals(isPlayAgain)) {
                    // 继续执行
                    // isExit = false;
                    break;
                } else if ("no".equals(isPlayAgain)) {
                    // 退出循环
                    isExit = true;
                    break;
                } else {
                    // 重新输入
                    System.out.println("输入错误，请重新输入yes或no");
                }
            }

            // 通过isExit判断是否退出循环
            if (isExit) break;

        }
    }


}
