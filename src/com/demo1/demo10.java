package com.demo1;

import javax.swing.*;

public class demo10 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
        System.out.println("另一端代码逻辑");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i ==arr.length-1){
                //如果满足条件，1说明是最后一个元素，特殊处理
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i] + ",");

            }
        }
    }
}
