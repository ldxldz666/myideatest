package hongyanhomework0;

import java.util.Arrays;
import java.util.Scanner;


public class level3 {


    /**
     * Lv3作业
     */
    public static void lv3() {
        Scanner in = new Scanner(System.in);

        // 创建存储学生信息的数组
        System.out.println("请输入要存储的学生数量：");
        int n = in.nextInt();
        String[][] students = new String[n][2];

        // 开始循环操作数组
        while (true) {
            System.out.println("请输入操作：\n1.查看所有学生信息\n2.增加学生信息\n" +
                    "3.删除学生信息\n4.修改学生信息\n5.查询学生信息\n6.退出");
            // 读取操作序号
            int operation = in.nextInt();
            // 是否退出程序
            boolean isExit = false;

            // 根据序号进行不同的操作
            switch (operation) {
                case 1:
                    print(students);
                    break;
                case 2:
                    create(in, students);
                    break;
                case 3:
                    delete(in, students);
                    break;
                case 4:
                    update(in, students);
                    break;
                case 5:
                    search(in, students);
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("输出错误，请重新输入");
                    continue;
            }

            // 通过isExit判断是否退出循环
            if (isExit) break;
        }
    }

    /**
     * 输出所有学生信息
     *
     * @param students 存储学生信息的数组
     */
    private static void print(String[][] students) {
        // 是否排序成功
        boolean isSuccessSort = bubbleSort(students);
        // 如果排序失败则数组内信息为空，无学生信息
        if (!isSuccessSort) {
            System.out.println("暂无学生信息");
        }

        // 遍历数组 逐一打印学生信息
        for (String[] student : students) {
            if (student[0] != null && student[1] != null) {
                System.out.println(Arrays.toString(student));
            }
        }
    }

    /**
     * 【Lv3-PLUS】使用冒泡排序按照学号大小从小到大排序输出
     *
     * @return 是否排序成功，如果数据为空则排序失败
     */
    private static boolean bubbleSort(String[][] students) {
        // 数组里是否存在学生数据
        boolean isHasStudents = false;
        // 判遍历数组断其包含的信息是否为空
        for (String[] student : students) {
            if (student[0] != null && student[1] != null) {
                isHasStudents = true;
                break;
            }
        }
        // 如果没有学生信息则排序失败 后面的内容将不再执行
        if (!isHasStudents) {
            return false;
        }

        // 对数组进行排序
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                // 如果当前学生信息为空则跳过
                if (students[j][0] == null || students[j][1] == null
                        || students[j + 1][0] == null || students[j + 1][1] == null) {
                    continue;
                }
                // 将学号转换为数字，按照从小到大排序
                if (Integer.parseInt(students[j][0]) > Integer.parseInt(students[j + 1][0])) {
                    String[] temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        return true;
    }

    /**
     * 增加学生信息
     *
     * @param in       读入器
     *      * @param students 存储学生信息的数组
     */
    private static void create(Scanner in, String[][] students) {
        System.out.println("请分别输入要增加的学生学号和姓名：");
        // 读取学生学号
        String stuNumber = in.next();
        // 读取学生姓名
        String stuName = in.next();
        // 增加学生信息是否成功
        boolean isSuccess = false;

        // 遍历学生数组并在数组中的空位置上插入数据
        for (int i = 0; i < students.length; i++) {
            if (students[i][0] == null && students[i][1] == null) {
                // 如果当前数据为空，则重新赋值
                students[i] = new String[]{stuNumber, stuName};
                isSuccess = true;
                break;
            }
        }

        // 如果增加成功则输出成功，否则提示增加失败
        if (isSuccess) {
            System.out.println("增加成功");
        } else {
            System.out.println("增加失败");
        }
    }

    /**
     * 删除学生信息
     *
     * @param in       读入器
     * @param students 存储学生信息的数组
     */
    private static void delete(Scanner in, String[][] students) {
        System.out.println("请输入要删除的学生学号：");
        // 读取学生学号
        String stuNumber = in.next();
        // 删除学生信息是否成功
        boolean isSuccess = false;

        // 遍历学生数组并在目标学号的信息删除置空
        for (int i = 0; i < students.length; i++) {
            if (students[i][0] != null && students[i][1] != null &&
                    students[i][0].equals(stuNumber)) {
                // 如果当前数据为空，则置空该数据
                students[i] = new String[]{null, null};
                isSuccess = true;
            }
        }

        // 如果删除成功则输出成功，否则提示删除失败
        if (isSuccess) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    /**
     * 修改学生信息
     *
     * @param in       读入器
     * @param students 存储学生信息的数组
     */
    private static void update(Scanner in, String[][] students) {
        System.out.println("请输入要修改的学生学号：");
        // 读取学生学号
        String stuNumber = in.next();
        System.out.println("请输入要修改的学生信息（包括学号和姓名）：");
        // 读取修改的学生信息
        String newStuNumber = in.next();
        String newStuName = in.next();
        // 修改学生信息是否成功
        boolean isSuccess = false;

        // 遍历学生数组并修改目标学号的信息
        for (int i = 0; i < students.length; i++) {
            if (students[i][0] != null && students[i][1] != null &&
                    students[i][0].equals(stuNumber)) {
                // 修改数据
                students[i] = new String[]{newStuNumber, newStuName};
                isSuccess = true;
            }
        }

        // 如果删除成功则输出成功，否则提示删除失败
        if (isSuccess) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    /**
     * 查询学生信息
     *
     * @param in       读入器
     * @param students 存储学生信息的数组
     */
    private static void search(Scanner in, String[][] students) {
        System.out.println("请输入要查询的学生学号：");
        // 读取学生学号
        String stuNumber = in.next();
        // 查询学生信息是否成功
        boolean isSuccess = false;

        // 遍历学生数组并输出目标学号的信息
        for (String[] student : students) {
            if (student[0] != null && student[1] != null &&
                    student[0].equals(stuNumber)) {
                // 输出学生信息
                System.out.println(Arrays.toString(student));
                isSuccess = true;
                break;
            }
        }

        // 如果查询成功则输出成功，否则提示查询失败
        if (isSuccess) {
            System.out.println("查询成功");
        } else {
            System.out.println("查询失败");
        }
    }
}
