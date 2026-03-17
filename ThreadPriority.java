


class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method ");
        Thread tobj = Thread.currentThread();
        String name = tobj.getName();
        System.out.println("name of current Thread is :"+name );
        int priority = tobj.getPriority();
        System.out.println("Priority of current Thread is :"+priority);
        tobj.setPriority(10);
        priority = tobj.getPriority();
        System.out.println("Priority of current Thread is :"+priority);

    }
}