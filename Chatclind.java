import java.io.*;
import java.net.*;

class Chatserver 
{
    public static void main(String A[]) throws Exception
     {
         


         socket sobj = new socket("localhost",5100);
         System.out.println("clind gets connected sucessfully ");

        printStream pobj = new printStream(sobj.getOutPutStream());
        BufferedReader bobj1 = new BufferedReader(new InputSreamReader(sobj.inputStream));
        BufferedReader bobj2 = new BufferReader(new InputStreamReader(System.in));




        System.out.println("enter message for server ");
        String str = bobj2.readLine();
        pobj.println(str);



        str = bobj1.readLine();
        System.out.println("server says ",+str);
     }
}