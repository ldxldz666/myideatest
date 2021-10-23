package com.demo1;

import java.util.Scanner;

//方法
public class demo6 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if (num %2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
