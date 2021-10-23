package shortcut;


import sun.security.util.Length;

import java.util.Scanner;

import static java.lang.System.*;

public class level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("请输入你想要的学生管理系统容量");
        int m = sc.nextInt();
        String[][] s = new String[m][2];


        lo:while (true) {											//lo 为标号
            System.out.println("请输入您想要的功能");
            out.println("输入1为查询增加学生，输入2为删除学生");
            System.out.println("如无需继续查看，请输入0退出程序");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    System.out.println("再见了您勒~");
                    break lo;
                case 1:
                    for (int i = 0; i < s.length; i++) {
                        if (s[i][0] == null && s[i][1] == null) {
                            System.out.println("请输入学号");
                            Scanner x = new Scanner(System.in);
                            String a = x.next();
                            System.out.println("请输入姓名");
                            String b = x.next();
                            s[i][0] =a;
                            s[i][1] =b;

                        }
                    }
                    out.println("目前数据有:");
                    for (int j = 0;j<m;j++) {
                        for(int k = 0;k <2;k++) {
                            out.println(s[j][k] + "\t");
                            out.print(" ");
                        }

                    }

                case 2:
                    for (int i = 0; i < s.length; i++) {
                        out.println("请输入学号来删除学生");
                        Scanner b = new Scanner(System.in);
                        String c = b.nextLine();
                        if(c == s[i][0]) {


                            s[i][0] = null;
                            s[i][1] = null;
                            System.out.println("卧槽");
                        }

//删除学生出了问题，无法实现555

                    }
                    out.println("目前数据库中有以下数据");
                    for (int j = 0;j<m;j++) {
                        for(int k = 0;k <2;k++) {
                            out.print(s[j][k] + "\t");
                        }
                    }
                    break;

                default:
                    System.out.println("您的输入有误");
                    break;
            }

        }
    }

}




        /*for (int i = 0; i < s.length; i++) {
            if (s[i][0] == null && s[i][1] == null) {
                System.out.println("请输入学号");
                Scanner x = new Scanner(System.in);
                String a = x.next();
                System.out.println("请输入姓名");
                String b = x.next();
                s[i][0] =a;
                s[i][1] =b;

            }
        }
        out.println("目前数据有:");
        for (int j = 0;j<m;j++) {
            for(int k = 0;k <2;k++) {
                out.println(s[j][k] + "\t");
            }
            out.println(" ");
        }
        for (int i = 0; i < s.length; i++) {
            out.println("请输入学号来删除学生");
            Scanner b = new Scanner(System.in);
            String c = b.next();
            if (s[i][0] != null && s[i][1] != null) {
                if (c == s[i][0]) {
                    s[i][0] = null;
                    s[i][1] = null;
                }
            }
        }
        out.println("目前数据库中有以下数据");
        for (int j = 0;j<m;j++) {
            for(int k = 0;k <2;k++) {
                out.println(s[j][k] + "\t");
            }
        }*/

    /*Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();*/