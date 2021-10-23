package hongyanhomework0;
import java.util.Scanner;

public class level1 {
    /**
     * Lv1作业
     */
    public static void lv1() {
        // 构造一个从控制台中读取数据的Scanner（扫描器）
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("请分别输入平时成绩，期中成绩和期末成绩：");
            // 平时成绩
            int usualScores = in.nextInt();
            // 期中成绩
            int midTermScores = in.nextInt();
            // 期末成绩
            int finalScores = in.nextInt();
            if (usualScores < 0 || usualScores > 100 ||
                    midTermScores < 0 || midTermScores > 100 || finalScores < 0 || finalScores > 100) {
                // 输入成绩有误，重新输入
                System.out.println("输入有误，请重新输入");
                continue;
            }

            // 计算最终成绩
            double scores = usualScores * 0.2 + midTermScores * 0.3 + finalScores * 0.5;

            // 根据最终成绩输出结果
            if (scores >= 60) {
                System.out.println("就这？还没我卷");
            } else {
                System.out.println("勇敢俊枭，不怕困难");
            }

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
