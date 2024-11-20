import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Mouseactions implements MouseListener {
    Label status;
    Frame vis;

    Mouseactions() {
        vis = new Frame("Mouse Listener");
        status = new Label("Mouse");
        status.setBounds(60, 60, 200, 30);
        vis.add(status);
        vis.addMouseListener(this);

        vis.setLayout(null);
        vis.setSize(400, 400);
        vis.setVisible(true);

        vis.addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Mouseactions();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        status.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        status.setText("mousepressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        status.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        status.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        status.setText("mouseExited");
    }
}
