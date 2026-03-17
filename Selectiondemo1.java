import java.util.Scanner;

class Selectiondemo1


{
    public static void main(String A[])

    {
       Scanner sobj = new Scanner (System.in);
       int iage = 0;
       
       System.out.println("Enter your age :");
       iage = sobj.nextInt();
       if(iage >= 18) 
       {
         System.out.println("you can vote ");
         
       }
       else
       {
        System.out.println("you cant vote");
       }
    }
}
