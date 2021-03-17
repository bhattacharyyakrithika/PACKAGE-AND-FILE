package pack1;
import java.util.Scanner;
public class class1 {
    public static void main(String []args)
    {
        class1 obj=new class1();
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
