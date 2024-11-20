import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class hello {
    void sample(){
        Frame fr=new Frame("pavani creativity");

        Label ld=new Label("Student Details:");
        ld.setBounds(50,30,300,30);

        TextField txt=new TextField("Enter your name and yourself:\n");
        txt.setBounds(50,70,200,20);

        TextArea tt=new TextArea(" Iam pavani\n" +
                "B-Tech\n" +
                "CSE-E sec\n" +
                "23BFA05279\n" +
                "Iam from tada in tirupati district ");
        tt.setBounds(50,100,300,100);

        Checkbox ch=new Checkbox("Enter your age:");
        ch.setBounds(50,210,200,30);

        Choice chr=new Choice();
        chr.add("age is:");
        chr.add("17");
        chr.add("18");
        chr.add("19");
        chr.setBounds(50,240,100,40);

        Button bt=new Button("Submit");
        bt.setBounds(50,270,100,30);

        // fr.add(ch);
        fr.add(ld);
        fr.add(txt);
        fr.add(tt);
        fr.add(bt);
        fr.add(chr);
        fr.add(ch);
        fr.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(300,300);
    }
    public static void main(String[] args) {
        hello he=new hello();
        he.sample();
    }
}

