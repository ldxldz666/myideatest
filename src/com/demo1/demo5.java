package com.demo1;

import java.util.Scanner;

//案例，评委打分1
public class demo5 {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0;i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;

            } else {
                System.out.println("您输入的打分有误，请检查是否处于0到100之间");
            i--;
            }
        }
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为"+max);

        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值为"+min);
                int sum = 0;
                for(int i = 0;i < arr.length;i++)

    {
        sum += arr[i];

    }
                //平均分
    int avg = (sum- max - min) / 4;
        System.out.println("平均数为"+avg);

}

}
