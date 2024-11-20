package Swing_Framework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Additon extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton b;
    JButton b1;
    JButton b2;
    JLabel l;

    Additon(){
        t1=new JTextField(30);
        t2=new JTextField(30);
        b= new JButton("Enter");
        b1=new JButton("ADD");
        b2=new JButton("SUB");
        l=new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        //add(b);
        add(l);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int result=num1+num2;
                l.setText(result+"");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int result=num1-num2;
                l.setText(result+"");
            }
        });
        b.addActionListener(this);
        //Actionlistener is an interface.It can be implement in class
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Addition Of Two Number");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
     new Additon();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int result=num1+num2;
        l.setText(result+"");
    }
}
