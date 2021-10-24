import java.util.Scanner;

public class demo26 {
    public static void main(String[] args) {
        //敏感词替换
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String s = sc.nextLine();
        String result = s.replace("TMD","***");
        System.out.println(result);
    }
}
