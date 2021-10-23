package com.demo1;
//案例：：：：：反转！！！！！
public class demo13 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int start = 0,end = arr.length-1;
        for( ;start<end;start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;//同demo12
        }
        for(int i = 0 ; i< arr.length; i++){
             //遍历
        }
    }
}
