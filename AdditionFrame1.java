import javax.swing.*;
import java.awt.event.*;

class marvellous implements ActionListener
{
    //characteristics
    JFrame fobj;
    JLabel No1,No2,Resultlabel;
    JButton bobj1,bobj2,bobj3,bobj4;
    JTextField tobj1,tobj2; 

    public marvellous(String title , int Width, int Height)
    {
        JFrame fobj = new JFrame("title");
        fobj.setLayout(null);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //No1 
        No1 = new JLabel("Enter No...");
        No1.setBounds(50,50,60,30);
        tobj1 = new JTextField();
        tobj1.setBounds(130,50,100,30);
        fobj.add(No1);
        fobj.add(tobj1);

        //No2
        No2 = new JLabel("Enter No....");
        No2.setBounds(50,100,60,30);
        tobj2 = new JTextField();
        tobj2.setBounds(130,100,100,30);
        fobj.add(No2);
        fobj.add(tobj2);

        //buttons 
        bobj1 = new JButton("+");
        bobj1.setBounds(100,145,45,50);
        fobj.add(bobj1);

        bobj2 = new JButton("-");
        bobj2.setBounds(150,145,45,50);
        fobj.add(bobj2);

        bobj3 = new JButton("*");
        bobj3.setBounds(200,145,45,50);
        fobj.add(bobj3);

        bobj4 = new JButton("/");
        bobj4.setBounds(250,145,45,50);
        fobj.add(bobj4);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);
    } 

    public void actionPerformed(ActionEvent aobj)
    {
        String No1 = tobj1.getText();
        String No2 = tobj2.getText();

        int iValue1 = Integer.parseInt(No1);
        int iValue2 = Integer.parseInt(No2);
        int iRet=0;

        Object source = aobj.getSource();
        if(source == bobj1)
        {
             iRet = iValue1 + iValue2;
             String Result = String.valueOf(iRet);
             JOptionPane.showMessageDialog(null,Result);

        }
        else if(source == bobj2)
        {
            
             iRet = iValue1 - iValue2;
             String Result = String.valueOf(iRet);
             JOptionPane.showMessageDialog(null,Result);
        }
        else if(source == bobj3)
        {
            
             iRet = iValue1 * iValue2;
             String Result = String.valueOf(iRet);
             JOptionPane.showMessageDialog(null,Result);
        }
         else if(source == bobj4)
        {
            
             iRet = iValue1 % iValue2;
             String Result = String.valueOf(iRet);
             JOptionPane.showMessageDialog(null,Result);
        }


    }
}


class AdditionFrame1
{
    public static void main(String A[])
    {
       marvellous mobj = new marvellous("calculator",400,300);
    }
}