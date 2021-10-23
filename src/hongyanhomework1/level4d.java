package hongyanhomework1;

public class level4d {


    private String name;
    private int price;


    public level4d(String name,int price){
        this.name = name;
        this.price = price;


    }


    public void setName(String s){
        this.name = s;

    }

    public void setPrice(int x){
        this.price = x;

    }

    public void show(){
        System.out.println("你选择了");
        System.out.println(name+"，"+price+"元");
    }

    public int setPrice() {
        return price;
    }

    public String setName() {
        return name;
    }
}
