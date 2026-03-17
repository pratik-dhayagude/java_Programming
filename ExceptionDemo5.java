import java.util.*;





class ExceptionDemo5
{
   public static void main(String A[])
   {

      Scanner sobj = new Scanner(System.in);
      int iNo1 = 0, iNo2 = 0,   iAns = 0;


      System.out.println("enter firest number: ");
      iNo1 = sobj.nextInt();

      System.out.println("enter second  number: ");
      iNo2 = sobj.nextInt();
      try
      {
      
      System.out.println("inside try block");
      iAns =  iNo1 /  iNo2;

      }
      catch(ArithmeticException aobj )
      {
         System.out.println("inside catch block");
         System.out.println(aobj);

      }
      catch(Exception eobj)  //generic catch
      {
         System.out.println("inside generic catch");
      }
      System.out.println("Division is :"+iAns);
   }
}