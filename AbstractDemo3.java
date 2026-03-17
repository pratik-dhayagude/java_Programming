 class Base
{
   public int i,j;
   public int Addition(int a, int b)
   {
      return a+b;

   }
    abstract public int substraction(int a, int b);
   
  

}

class Derived extends Base   //Error
{
   
    public int subtraction(int a,int b)
    {
        return a-b;
    }
    public int multiplication(int a,int b)
    {
        return a*b;
    }

}

class AbstractDemo3
{
    public static void main(String A[])
    {
      
       Base bp = new Derived (); 
       int iRet = 0;

       iRet=bp.Addition(11,10);
       iRet=bp.substraction(11,10);
      // iRet=bp.multiplication(11,10); //ERROR
     
       
     

    }
}
