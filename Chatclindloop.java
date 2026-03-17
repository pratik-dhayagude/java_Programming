import java.io.*;
import java.net.*;

class Chatserver 
{
    public static void main(String A[]) throws Exception
     {
         


         socket sobj = new socket("localhost",5100);
         System.out.println("clind gets connected sucessfully ");

        printStream pobj = new printStream(sobj.getOutPutStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.inputStream));
        BufferedReader bobj2 = new BufferReader(new InputStreamReader(System.in));

         System.out.println("__________________________________________________");
        System.out.println("___________  marvellous server ___________________");
        System.out.println("__________________________________________________");

         String str1 =null, str2 = null;     

         While(!(str1 = bobj2.readLine()).equals("End"))
         {
             pobj.println(str1);
             str2 = bobj1.readLine();
             System.out.println("Server says ",+str2);
              System.out.println("Enter message for server:");


         }
      
     }
}