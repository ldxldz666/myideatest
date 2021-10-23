package com.demo1;
//数据交换
public class demo12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a^b;//a = 10^20
        b = a^b;//b = 10^20  b=10
        a = a^b;//a = 10^20^10一个数被另一个数异或2次，不变a= 20

//面试题!!!!!!!!!!!!!!!!!!!!!!!!!!!1



       /* int temp = a;//a丢不了了
        a = b;
        b = temp;
*/
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
