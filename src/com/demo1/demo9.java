package com.demo1;
//方法重载：同一个类中，方法明相同，参数不同的方法
//参数不同：个数不同，类型不同，顺序不同.
//方法重载不用记忆过多反锁的方法名字
public class demo9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:"+number);
        change(number);
        System.out.println("调用change方法后:"+number);

    }
//如果是change中用的数组，如定义的arr，则改变数组中数字，即为200
    public static void change(int number) {
        number = 200;
    }
}
