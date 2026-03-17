import java.io.*;
import java.net.*;

class Chatserverloop
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

         System.out.println("__________________________________________________");
        System.out.println("___________  marvellous server ___________________");
        System.out.println("__________________________________________________");

        String str1 =null, str2 = null;     

        while(str1 = bobj1.readLine() != null)
        {
            System.out.println("client says :",+str1);
            System.out.println("Enter message for client:");
            str2 = bobj2.readLine();
            pobj.println(str2);

        }  
    }
}