import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("server is runing...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at 2100");
        Socket sobj = ssobj.accept();
        System.out.println("cliend request accepted arrives and accepted by the server ");

    }
}