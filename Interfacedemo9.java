interface A
{ 
  int no = 11;
  void fun();
  
}



class Demo implements A
{
  public void fun()
  {
    System.out.println("inside fun");  
  }


}

class Interfacedemo9

{
  public static void main(String A[])
  {
   Demo dobj = new Demo();
   dobj.fun();
   dobj.gun();
  // dobj.Display();Error

  

  }  

}