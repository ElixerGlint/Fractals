import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Mondy extends JPanel implements MouseListener {
    private int width;
    private int height;
    private int depth;

    public static Color[] colors = {Color.black, Color.red, Color.white, Color.blue, Color.yellow};

    public Mondy(int w, int h, int d) {
        this.addMouseListener(this);
        width = w;
        height = h;
        depth = d;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        mondy(g,0,0,width,height,depth);



    }

    public void mondy(Graphics g, int x, int y, int w, int h, int d) {
        if (d <= 0) {
            return;
        }

        g.setColor(colors[(int)(Math.random()*colors.length)]);
        g.fillRect(x, y, w, h);
        g.setColor(Color.gray);
        g.drawRect(x, y, w, h);

        if(Math.random()<0.5) { //a 50/50 coin flip HORIZONTAL
            mondy(g, x, y, w, h/2, d-1);
            mondy(g, x, y + h/2, w, h/2, d-1);
        }
        else {
            mondy(g, x, y, w/2, h, d-1);
            mondy(g, x + w/2, y, w/2, h, d-1);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getButton() == e.BUTTON1) {
            depth++;
            this.repaint();
        }
        if(e.getButton() == e.BUTTON3) {
            depth--;
            this.repaint();
        }
       // throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}
