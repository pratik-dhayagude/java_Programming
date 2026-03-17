class Demo{
    public int i;
    public static int j;
    static{
        j=21;

    }

    public Demo()
    {
        System.out.println("inside default");  // firest use 

    }
    public Demo(int a)
    {
        this();  // second use

        System.out.println("inside the parametrised");

    }
    public void display()
    {
        System.out.println("inside display"+this);  //third use 
    }
}




class Super demo
{

    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }

}