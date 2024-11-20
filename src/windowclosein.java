import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class windowclosein extends Frame {

    windowclosein() {
        Button btn = new Button("Click");
        add(btn);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args){
        new windowclosein();
    }
}
