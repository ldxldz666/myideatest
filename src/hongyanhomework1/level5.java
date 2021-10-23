package hongyanhomework1;


import java.util.ArrayList;
import java.util.Scanner;

public class level5 {

    private static Object String;
    private int size;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("红岩网校安卓");
        list.add("红岩网校牛逼");
        list.add("红岩网校厉害");
        System.out.println(list);
        lo:while(true){
            System.out.println("请输入1-5序号，从而为红岩数组加元素~");
            System.out.println("其中，1为加元素，2为得元素，3为删除某个元素，4为给对应位置加元素");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a){
                case 0:
                    System.out.println("结束任务,GG");
                    System.out.println("廖神廖神，我的男神");
                    System.out.println("王兮王兮，爱如潮汐");
                    break lo;
                case 1:



            }
        }
    }


}
