public class demo19Private {
    private String name;
    private int age;

    public void setName (String n){
        //此处不能直接String  name，会出现问题，null
        //修改方法.name  = name 前加上this.   即this.name = name;
        name = n;
    }

    public String getName(){
        return name;

    }
    public void setAge(int a){
        //此处不能直接 int age，会出现问题，0    问题为局部变量与全部变量重合，只能就近原则，即用局部变量，没有赋值的情况，即0
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name +"..."+age);
    }


}
