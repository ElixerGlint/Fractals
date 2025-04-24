import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;

public class App{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("oOOooOOO AaaaAAaaAA");
        frame.add(new Mondy(frame.getWidth(), frame.getHeight(), 10));
        frame.setVisible(true);

        



        
        frame.repaint();

    }
}
