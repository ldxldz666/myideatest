public class demo22 {

    public static void main(String[] args) {
        //1.无参数构造方法创建对象，通过setXXX来给成员变量赋值
        demo21 stu1 = new demo21();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.show();

        //2.有参数构造方法
        demo21 stu2 = new demo21("李四",2);
    }
}
