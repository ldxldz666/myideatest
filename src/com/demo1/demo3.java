package com.demo1;

import java.util.Scanner;
//查找元素
public class demo3 {
    public static void main(String[] args) {
        int [] arr =new int [5];
        arr[0]= 19;
        arr[1]= 28;
        arr[2]= 37;
        arr[3]= 46;
        arr[4]= 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的元素:");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0;i< arr.length;i++){
            if (num == arr[i]){
                index = i;
                break;

            }
        }
        System.out.println(index);
    }
}
