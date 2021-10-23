package com.demo1;
//带返回值方法的定义和调用
import sun.misc.PostVMInitHook;


/*
public class demo8 {
    public static void main(String[] args) {
    int num = add (10,20);//带变量接受，直接使用方法不行
        System.out.println(num);
    }

    public static int add (int a,int b) {
        int c = (a + b);
        return c;
    }
}
*/
public class demo8 {
    public static void main(String[] args) {
     /*   int num = getMax(10,20);  老方式可以继续使用num变量
        System.out.println(num);    尽量用变量接受
下面简化*/
        System.out.println(getMax(10,20));//输出调用
    }

    public static int getMax(int a,int b) {
        if (a>b){
            return a;
        }else{
            return b;
        }

    }
}
