import java.util.Scanner;

class Selectiondemo1


{
    public static void main(String A[])

    {
       Scanner sobj = new Scanner (System.in);
       int iStd = 0;
       
       System.out.println("Enter your Standred :");

       iStd = sobj.nextInt();

       if(iStd==1) 
       {
         System.out.println(" Exam at 9 am  ");
         
       }
       alseif("iStd==2")
       {
        System.out.println("Exam at 10 am");
       }
       else
       {
        System.out.println("invalid Standred ");
        
       }
    }
}
