package p2;
import p1.A;
public class B extends A{
    public static void main(String []args)
    {
        B obj=new B();
        obj.work();
    }
    void work()
    {
        int a,b;
        A o=new A();
        a=o.input();
        b=o.input();
        System.out.println("SUM :"+(a+b));
    }
}
