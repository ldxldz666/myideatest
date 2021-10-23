package com.demo1;

import sun.misc.PostVMInitHook;

public class demo7 {
    public static void main(String[] args) {
        print(10,20);//直接打10和20，不需要自己打n,m
    }


        public static  void print(int n,int m){
        if(m < n){
            System.out.println("您输入的数据有误,请检查");
            return;//return;可以勇于结束方法，也就是将方法从栈内存中谭出去，该过程称之为方法的弹栈
        }
            System.out.println(n+"到"+m+"之间的奇数");
            for (int i = n;i <=m;i++){
                if ( i % 2 == 1){
                    System.out.println("奇数"+i);
                }
            }
        }

    }

