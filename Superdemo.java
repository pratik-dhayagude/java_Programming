class Hello
{
    public int i;
    public Hello(int no)
    {
        System.out.println("inside hello constructor");
        this.i =no+1;
    }
    public void display ()  
    {
        System.out.println("inside hello display");
    }

}



class Demo extends Hello
 {
    public int i;
    

   
    
    public Demo(int a)
    {   super(a);  //firest use

        System.out.println("inside Demo constructor");  
        this.i=a;

    }
   
    public void display()
    {
        int i = 0;
         System.out.println("inside display"+i);  //0
        System.out.println("inside display"+this); //51 
        System.out.println("inside display"+super.i);  //52  //second use 
        super.display(); //third use 
    }
}




class Superdemo
{

    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.display();
        
    }

}