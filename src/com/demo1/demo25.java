import java.util.Scanner;

public class demo25 {
    public static void main(String[] args) {
        //手机号屏蔽

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String telString = sc.nextLine();

        String start = telString.substring(0,3);
        String end = telString.substring(7);
        System.out.println(start+"****"+end);
        /*String s = "itheima";
        String ss = s.substring(2);
        System.out.println(ss);*/
       /* String sss = s.substring(0,1);//包含头不包含尾'sout
        System.out.println(sss);*/

    }
}
