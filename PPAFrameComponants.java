import javax.swing.*;



class PPAFrameComponants

{
    public static void main(String A[])
    {
       JFrame fobj = new JFrame("PPa");

       JButton bobj = new JButton("ok");

       fobj.add(bobj);

       fobj.setSize(300,300);

       fobj.setVisible(true);

       fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
    }
}