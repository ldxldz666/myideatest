public class demo21 {
    private String name;
    private int age;
//与demo22一起
            //无参数构造方法
    /*public demo21(){

    }*/

    //有参数构造方法

    /*public demo21(String name,int age){
        this.name = name;
        this.age = age;
    }*/

    public demo21(){

    }

    public demo21(String name, int i) {
    }

    public void demo21 (String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name+"..."+age);
    }

}
