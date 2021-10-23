public class Demo18 {
    String name;
    private int age;



    //设置值
    public void setAge(int a){
        if(a >= 0&& a<=120){
            age = a;

        }else{
            System.out.println("您的年龄不合理");
        }

    }

    public int getAge(){
        return age;

    }
    public void show(){
        System.out.println(name+"..."+age);
    }


}



