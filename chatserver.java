import java.io.*;
import java.net.*;

class Chatserver 
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("server is wating at port 5100");

        Socket sobj = ssobj.accept();
        System.out.println("clind request gets accepted sucessfully ");
    
        PrintStream pobj = new PrintStream(sobj.getOutPutStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.InputStream));
        BufferedReader bobj2 = new BufferReader(new InputStreamReader(System.in));






         bobj1.readLine();
        System.out.println("cliend says "+str);
        System.out.println("enter message for cliend ");
        str = bobj2.readLiine();
        pobj.println(str);
    }
}