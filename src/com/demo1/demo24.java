import java.util.Scanner;

public class demo24 {
    public static void main(String[] args) {

        //统计字符次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i<chars.length;i++){
            char c = chars[i];
            if((c >= 'A') && (c <= 'Z')){
                bigCount++;
            }else if(c >= 'a'&&c<='z'){
                smallCount++;
            }else if (c >= '0'&&c<='9'){
                numCount++;
            }
        }

        System.out.println("大写字母字符:"+bigCount);
        System.out.println("小写字母字符:"+smallCount);
        System.out.println("数字字母字符:"+numCount);
    }

}
