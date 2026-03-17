import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("server is runing...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at 2100");
        Socket sobj = ssobj.accept();
        System.out.println("cliend request accepted arrives and accepted by the server ");
 
        DataInputStream diobj = new DataInputStream(sobj.getInputStream());//eaer
        DataOutputStream doobj = new DataOutputStream(sobj.getoutputStream());//mouth

        int No1 = 0,No2 = 0;

        No1 = diobj.readInt();
        no2 = diobj.readInt();

        int sum = No1+No2;

        doobj.writeInt(sum);


        sobj.close();
        ssobj.close();
        System.out.println("server application terminated....");
    }
}