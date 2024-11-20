import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
//import static java.awt.AWTEventMulticaster.add;

public class counter extends JFrame{
    JTextField display;
    JButton Increment,Reset;
    counter(){
        display=new JTextField("0");
        display.setBounds(100,50,170,20);

        Increment=new JButton("increment");
        Increment.setBounds(50,80,100,20);
        Increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(display.getText());
                display.setText(String.valueOf(++num));
            }
        });

        Reset=new JButton("Reset");
        Reset.setBounds(200,80,100,20);
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        add(display);
        add(Increment);
        add(Reset);
        setTitle("Tally counter");
        setSize(500,500);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        new counter();
    }
}
