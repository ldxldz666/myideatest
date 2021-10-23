package hongyanhomework1;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import sun.plugin.extension.ExtensionUtils;

import javax.swing.text.DefaultCaret;
import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class level4 {


    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int sum = 0;
        System.out.println("欢迎来到国民饭店，这是今天的菜单。");
        String[] arr = {"1.辣子鸡丁，38元", "2.水煮肉片，22元", "3.糖醋里脊，18元", "4.干锅牛肉，38元", "5.干锅排骨，29元"};
            for (int x = 0; x < arr.length; x++) {
                System.out.println(arr[x]);
            }

            level4d CD1 = new level4d("1.辣子鸡丁", 38);
            level4d CD2 = new level4d("2.水煮肉片", 22);
            level4d CD3 = new level4d("3.糖醋里脊", 18);
            level4d CD4 = new level4d("4.干锅牛肉", 38);
            level4d CD5 = new level4d("5.干锅排骨", 29);

            Scanner sc = new Scanner(System.in);
            String temp = null;
            int tmpe = 0;
            System.out.println("请输入菜品编号");
            int x = sc.nextInt();
            if (x == 1) {
                CD1.show();
                a = CD1.setPrice();
                 temp = CD1.setName();
                 tmpe = CD1.setPrice();
            } else if (x == 2) {
                CD2.show();
                a = CD2.setPrice();
                 temp = CD2.setName();
                 tmpe = CD2.setPrice();
            } else if (x == 3) {
                CD3.show();
                a = CD3.setPrice();
                 temp = CD3.setName();
                 tmpe = CD3.setPrice();
            } else if (x == 4) {
                CD4.show();
                a = CD4.setPrice();
                 temp = CD4.setName();
                 tmpe = CD4.setPrice();
            } else if (x == 5) {
                CD5.show();
                a = CD5.setPrice();
                 temp = CD5.setName();
                 tmpe = CD5.setPrice();
            }


            String woo = null;
            int oww = 0;
            System.out.println("请输入菜品编号");
            Scanner ab = new Scanner(System.in);
            int c = ab.nextInt();
            if (c == 1) {
                CD1.show();
                b = CD1.setPrice();
                 woo = CD1.setName();
                 oww = CD1.setPrice();
            } else if (c == 2) {
                CD2.show();
                b = CD2.setPrice();
                 woo = CD2.setName();
                 oww = CD2.setPrice();
            } else if (c == 3) {
                CD3.show();
                b = CD3.setPrice();
                 woo = CD3.setName();
                 oww = CD3.setPrice();
            } else if (c == 4) {
                CD4.show();
                b = CD4.setPrice();
                 woo = CD4.setName();
                 oww = CD4.setPrice();
            } else if (c == 5) {
                CD5.show();
                b = CD5.setPrice();
                 woo = CD5.setName();
                 oww = CD5.setPrice();
            }

            sum = tmpe + oww;
            System.out.println("你一共选择了");
            System.out.println(temp+","+woo);
            System.out.println("一共"+sum+"元");
            System.out.println("请选择支付方式");
            String abb [] = {"1.支付宝","2.微信支付","3.人脸识别"};
                for (int n = 0; n < abb.length; n++) {
                    System.out.println(abb[n]);
                }
            int h =sc.nextInt();

                    if (h == 1) {
                        System.out.println("请亮出你的付款码");

                    } else if (h == 2) {
                        System.out.println("请亮出你的付款码");

                    } else if (h == 3) {
                        System.out.println("请亮出你的大头~");

                    } else {
                        System.out.println("您的输入有错误");
                    }












        /*int [] abb = {38,22,18,38,29};
        int z = 0;
        int sum = 0;
        String [] xzz = new String[2];
        xzz[0]=" ";
        xzz[0]=" ";
        for (int i = 0;i<2;i++){

            for (int x = 0;x<arr.length;x++){
                System.out.println(arr[x]);
            }
            System.out.println("请输入想要点打菜的序号,序号值为1-5的整数");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

                xzz[i] =arr[a-1] ;

            if(a<6) {
                System.out.println("你一共选择了:");
                for(int b = 0;b<xzz.length;b++){
                    System.out.println(xzz[b]);
                    sum += abb[a-1];
                    System.out.println("一共花费"+sum+"元");
                }
                System.out.println("还有需要点的菜么？");
            }else{
                System.out.println("请重新输入1-5之间的数字");
            }
        }

        System.out.println("请选择支付方式");
        String [] zf = {"1.支付宝","2.微信","3.人脸识别"};
        for (int q = 0;q<zf.length;q++){
            System.out.println(zf[q]);
        }
        Scanner ab =new Scanner(System.in);
        int g =ab.nextInt();
        System.out.println("您使用的是"+zf[g-1]+"支付方式");
        System.out.println("谢谢您的购买");
        */



    }
}



/*lo:while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入想要菜品1-5的序号,点完餐后输入6进入结算。如若无需点餐，请输入0退出点餐系统");
            int a = sc.nextInt();
            z++;
            for (int s = 0;s<z;s++){
                if(a<6) {
                    sum += abb[a-1];
                }
            }
            switch (a){
                case 0:
                    System.out.println("感谢您使用究极妙妙屋餐厅系统");
                    break lo;
                case 1:
                    System.out.println("你选择了：");
                    System.out.println(arr[0]);
                    break;
                case 2:
                    System.out.println("你选择了: ");
                    System.out.println(arr[1]);
                    break;
                case 3:
                    System.out.println(arr[2]);
                    break;
                case 4:
                    System.out.println("你选择了: ");
                    System.out.println(arr[3]);
                    break;
                case 5:
                    System.out.println("你选择了: ");
                    System.out.println(arr[4]);
                    break;
                case 6:
                    System.out.println("你一共选择了");
                    System.out.println("你一共选择了"+arr[a-1]);
                    System.out.println("一共"+sum+"元");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入0-5之间的整数");
                    break;
            }
        }*/