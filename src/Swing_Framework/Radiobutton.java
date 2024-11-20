package Swing_Framework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class Radiobutton extends JFrame implements ActionListener {
    JTextField t;
    JLabel l;
    JButton b;
    JRadioButton r1;
    JRadioButton r2;

    Radiobutton() {
        t = new JTextField(30);
        l = new JLabel("Gender");
        b = new JButton("Enter");
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t);
        add(r1);
        add(r2);
        add(b);
        add(l);
        b.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Male or female");
        setSize(300, 300);
    }

    public static void main(String args[]) {
        new Radiobutton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String msg=t.getText();
       if(r1.isSelected()){
           msg="Mr."+msg;
       }
       else{
           msg="Ms."+msg;
       }
       l.setText(msg);
    }
}
