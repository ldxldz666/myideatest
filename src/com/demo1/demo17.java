package com.demo1;
//案例，二维数组求和
public class demo17 {
    public static void main(String[] args) {
        int sum = 0;
        int [][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for (int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
