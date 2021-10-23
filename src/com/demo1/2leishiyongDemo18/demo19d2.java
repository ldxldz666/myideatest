public class demo19d2 {
    public static void main(String[] args) {
        demo19Private stu = new demo19Private();
        stu.setName("张三");
        stu.setAge(23);


        System.out.println(stu.getName());
        System.out.println(stu.getAge());


        stu.show();
    }
}
