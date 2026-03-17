import javax.swing.*;
import java.awt.event.*;


class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
        {
          JOptionPane.showMessageDialog(null,"Button Clicked");

        }
}
class EventHandlingSeperateclassXX

{
    public static void main(String A[])
    {
       JFrame fobj = new JFrame("PPa");

       JButton bobj = new JButton("ok");

       bobj.setBounds(50,150,150,50);
       MarvellousListener mobj = new MarvellousListener();

       bobj.addActionListener(mobj);

       


       fobj.add(bobj);

       fobj.setSize(400,300);
       fobj.setLayout(null);


       fobj.setVisible(true);

       fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
    }
}