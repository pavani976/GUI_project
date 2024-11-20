import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class mousegame extends Frame implements MouseMotionListener {

    int circleX = 200, circleY = 200, circleRadius = 5;

    mousegame() {
        addMouseMotionListener(this);
        setLayout(null);
        setSize(900, 900);
        setTitle("Ball game");
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillOval(circleX, circleY, 5 * circleRadius, 5 * circleRadius);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       /* int x = e.getX();
        int y = e.getY();
        if (x < circleX + circleRadius) {
            circleX++;
        }
        if (x > circleX + circleRadius) {
            circleX--;
        }
        if (y< circleY + circleRadius) {
            circleY++;
        }
        if (y > circleY + circleRadius) {
            circleY--;
        }
        repaint();*/
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x < circleX + circleRadius) {
            circleX++;
        }
        if (x > circleX + circleRadius) {
            circleX--;
        }
        if (y< circleY + circleRadius) {
            circleY++;
        }
        if (y > circleY + circleRadius) {
            circleY--;
        }
        repaint();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new mousegame();
    }
}
