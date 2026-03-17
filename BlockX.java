class Demo
{
  public int i;  ///instance variable 
  static public int j ;  ///class variable

  static
  {
     System.out.println("inside static block ");
     j = 21;

  } 
  {
    System.out.println("inside initializer block ");
  }

  public Demo()
  {
    System.out.println("inside constructor");
    this.i = 11;
    
  }
  public Demo(int a)
  {
    System.out.println("inside parametrised constructor");
    this.i = 11;
    
  }

}

class BlockX
{
    public static void main(String A[])
    {
       System.out.println("inside main ");
       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();
       Demo dobj3 = new Demo();
       Demo dobj4 = new Demo(11);
    }
}