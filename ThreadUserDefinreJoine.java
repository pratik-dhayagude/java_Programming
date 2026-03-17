class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of :"+Thread.currentThread().getNmae());

    }
}


class ThreadUserDefineJoine
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj.setNmae("firest");
        dobj.setNmae("second");

        dobj1.start();
        dobj2.start();
        System.out.println("End of main Thread");
    }
}