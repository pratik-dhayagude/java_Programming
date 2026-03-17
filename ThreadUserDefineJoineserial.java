class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of :"+Thread.currentThread().getName());

    }
}


class ThreadUserDefineJoineserial
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("firest");
        dobj2.setName("second");

        
        //cheaked Exception
        try
       { 
        
        dobj1.start();
        dobj1.join();
        System.out.println("End of firest Thread");

        dobj2.start();
        dobj2.join();
        System.out.println("End of second Thread");
        }
        catch(InterruptedException iobj)
        {

        }
        System.out.println("End of main Thread");
    }
}