import java.util.Scanner;

public class demo23 {
    public static void main(String[] args) {
        //用户登录
        String username = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i<=3;i++) {
            System.out.println("请输入用户名：");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码：");
            String scPassWord = sc.nextLine();
            if (username.equals(scUsername) && password.equals(scPassWord)) {
                System.out.println("登录成功");
                break;
            } else {
                if(i == 3){
                    System.out.println("你的登录次数已达到今日上线，请明天再来。");
                }
                System.out.println("登录失败,您还剩余"+(3-i)+"次机会");
            }
        }
    }
}


