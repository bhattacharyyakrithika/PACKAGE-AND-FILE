import java.io.*;
import java.util.Scanner;
public class input {
    public static void main(String []args)throws IOException
    {
        Scanner in=new Scanner(System.in);
        FileWriter fw=new FileWriter("I.txt");
        int i,roll;
        String name=new String();
        for(i=0;i<3;i++)
        {
            System.out.println("ENTER DATA");
            roll=in.nextInt();
            name=in.next();
            fw.write(roll+"%"+name+"\n");
        }
        fw.close();
    }
}
