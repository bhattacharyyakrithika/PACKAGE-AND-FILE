package pack2;
import pack1.class1;
public class class2 extends class1{
    public static void main(String []args)
    {
        class2 obj=new class2();
        obj.work();
    }
    void work()
    {
        int a,b;
        class1 o=new class1();
        a=o.input();
        b=o.input();
        System.out.println("SUM :"+(a+b));
    }
}
