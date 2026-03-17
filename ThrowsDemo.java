class Demo{
    public int Division(int iNo1,int iNo2 ) throws ArithmeticException
    {
        int iAns = 0;
        iAns = iNo1/iNo2;
        return iAns;

    }
}


class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo();
        int Ret = 0;
        try{

        
        Ret = obj.Division(11,2);
        }
        catch(ArithmeticException aobj)
        {
             System.out.println("Divsion catch:"+aboj);
        }
        System.out.println("Divsion is:"+Ret);

    }
}