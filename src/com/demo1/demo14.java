package com.demo1;
//二维数组的静态初始化
public class demo14 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);



        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
        //向二维数组中存储元素

        arr[0][0]=11;
        arr[1][1]=22;
        arr[2][2]=33;
        arr[0][1]=11;
        arr[0][2]=22;
        arr[1][0]=33;
        arr[1][2]=11;
        arr[2][0]=22;
        arr[2][1]=33;




        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

    }
}