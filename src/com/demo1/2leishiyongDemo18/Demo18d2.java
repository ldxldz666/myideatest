import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import sun.misc.PostVMInitHook;

public class Demo18d2 {
    public static void main(String[] args) {
        Demo18 stu = new Demo18();
        stu.name="张三";
        stu.setAge(-23);
        stu.show();
    }
}
