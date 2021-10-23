package com.demo1;
//获取数组最大值和最小值
public class demo11 {
    public static void main(String[] args) {
        int[] arr = {11,55,22,44,33};
        int[] maxandmin = getMax(arr);
        System.out.println("最大值为"+maxandmin[1]);
        System.out.println("最小值为"+maxandmin[0]);

    }

    public static int[] getMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = 1;i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        int [] maxAndMin = {min,max};
        return maxAndMin;

    }

}
