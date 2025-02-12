import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class submit_form {
    void simple() {
        Frame f = new Frame("Personal Details :");

        Label k=new Label("Fill The Below Form:");
        k.setBounds(120,40,150,30);
        f.add(k);
        Label l = new Label("E-mail:");
        l.setBounds(80, 80, 100, 20);
        TextField email = new TextField("Enter your e-mail");
        email.setBounds(180, 80, 150, 20);
        f.add(l);
        f.add(email);

        Label b = new Label("Password:");
        b.setBounds(80, 110, 100, 20);
        TextField pass = new TextField("Enter your password");
        pass.setBounds(180, 110, 150, 20);
        f.add(b);
        f.add(pass);

        Label h = new Label("Age:");
        h.setBounds(80, 140, 100, 20);
        TextField age = new TextField("Enter your age");
        age.setBounds(180, 140, 150, 20);
        f.add(h);
        f.add(age);

        Button bt = new Button("Submit");
        bt.setBounds(140, 180, 60, 30);
        f.add(bt);
       /* ActionListener sub = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(email.getText());
                System.out.println(pass.getText());
                System.out.println(age.getText());
            }
        };*/
        form sub=new form(email,pass,age);
        bt.addActionListener(sub);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);

    }
    public static void main(String[] args){
        submit_form p=new submit_form();
        p.simple();
    }
}
class form implements ActionListener{
    TextField email;
    TextField pass;
    TextField age;
    form(TextField email,TextField pass,TextField age){
        this.email=email;
        this.pass=pass;
        this.age=age;
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println(email.getText());
        System.out.println(pass.getText());
        System.out.println(age.getText());
    }
}
