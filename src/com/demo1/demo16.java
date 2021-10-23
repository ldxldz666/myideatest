package com.demo1;

public class demo16 {
    public static void main(String[] args) {
        int [][] arr = {{11,22,33},{33,44,55}};
        //遍历二维数组，取出里面每一个一维数组
        for (int j = 0;j < arr.length;j++){
            //arr[i]  为一位数组
            //for(int i = 0;i< arr.length;i++){
                //System.out.println(arr[i]);
                //在编里的过程中，对每一个一维数组继续玩成遍历，获取内部存储的每一个元素



            /*int [] temp = arr[j];                   一种方法取出数值
                for(int  i = 0;i < temp.length;i++){
                    System.out.println(temp[i]);
                }
              */



            for (int i = 0;i<arr[j].length;i++){
                System.out.println(arr[j][i]);
            }

        }
        System.out.println(arr.length);
    }
}
