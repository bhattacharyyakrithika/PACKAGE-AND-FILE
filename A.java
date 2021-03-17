package p1;
import java.util.Scanner;
public class A {
    public static void main(String []args)
    {
        A obj=new A();
        obj.input();
    }
    public int input()
    {
        int a;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        return a;
    }
}
