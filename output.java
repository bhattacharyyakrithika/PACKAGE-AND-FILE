import java.io.*;
public class output {
    public static void main(String []args)throws IOException
    {
        FileReader fr=new FileReader("I.txt");
        FileWriter fw=new FileWriter("O.txt");
        BufferedReader br=new BufferedReader(fr);
        String s=new String();
        int ind,i=1;
        while((s=br.readLine())!=null)
        {
            fw.write("SL "+i+" - ");
            ind=s.indexOf("%");
            fw.write(s.substring(0,ind));
            fw.write(" ");
            fw.write(Character.toUpperCase(s.charAt(ind+1)));
            fw.write("\n");
            i++;
        }
        br.close();
        fw.close();
        fr.close();
    }
}
