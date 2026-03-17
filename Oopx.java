class Arithematic
{
   public int iNo1;
   public int iNo2;

   public Arithematic()

   {
     this.iNo1=0;
     this.iNo2=0;

   }

   public Arithematic(int i , int j)
   {
     this.iNo1=i;
     this.iNo2=j;
   
   }
   public int Addition()
   {
      int iAns=0;
      iAns=this.iNo1+this.iNo2;
      return iAns;
   }
   public int subtraction()
   {
      int iAns=0;
      iAns=this.iNo1-this.iNo2;
      return iAns;
   }
   

}


class Oopx
{
   public static void main(String Arr[])
   {
     Arithematic aobj1=new Arithematic(11,10);
     int iRet=0;

     iRet=aobj1.Addition();
     System.out.println("Addition is:"+iRet); //cot<<"Addition is :"<<iRet<<"/n"
     iRet=aobj1.subtraction();
     System.out.println("subtraction is:"+iRet);

     aobj1=null;

   }   

}