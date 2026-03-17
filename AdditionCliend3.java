import java.util.*;
import java.io.*;
import java.net.*;



class AdditionCliend3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("cliend is runing...");
        Socket sobj = new Socket("localhost",2100);
        System.out.println("server successfully connected ");
        
        DataInputStream diobj = new DataInputStream(sobj.getInputStream());//eaer
        DataOutputStream doobj = new DataOutputStream(sobj.getoutputStream());//m

        int No1 = 11,No2 = 10;

        doobj.writeInt(No1);
        doobj.writeInt(No2);



        int sum = diobj.readInt();  
        System.out.println("Addition is :"+sum);

        sobj.close();

        System.out.println("cliend application terminated....");

    }
}