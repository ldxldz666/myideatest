package hongyanhomework1;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class level2 {
    public static void main(String[] args) {
        int [] arr = {15,10,30,25,40,20,35,50,45};
        System.out.println("排列前的数组");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");

        }
        System.out.println("排列后的数组");
        for(int n = 0;n<arr.length-1;n++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");

        }
        System.out.println();
        int [] newarr = new int[arr.length+1];
        for (int k = 0; k < arr.length; k++)
        {
            newarr[k] = arr[k];
        }
        System.out.print("请输入你想要加入的新数字");
        Scanner sc = new Scanner(System.in);
        newarr[arr.length] =sc.nextInt();

        for(int n = 0;n<newarr.length-1;n++) {
            for (int c = 0; c < newarr.length - 1; c++) {
                if (newarr[c] < newarr[c + 1]) {
                    int xxx = newarr[c];
                    newarr[c] = newarr[c + 1];
                    newarr[c + 1] = xxx;
                }
            }
        }
        for(int z = 0; z<newarr.length; z++){
            System.out.print(newarr[z]+"\t");

        }



    }



}



//for (int i=1; i<arr.length; ++i){
//        int value = arr[i];
//        int position=i;
//        while (position>0 && arr[position-1]>value){
//            arr[position] = arr[position-1];
//            position--;
//        }
//        arr[position] = value;
//    }//loop i