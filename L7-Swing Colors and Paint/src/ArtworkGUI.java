import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {
    JFrame frame;

    public ArtworkGUI() {

        frame = new JFrame("Simple Drawing");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel {

        public MyDrawing(){
            //Set the background color
            setBackground(Color.blue);
        }

        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(Color.RED);
            g.drawRect(125, 215, 250, 200);

            Color grass = new Color(123, 252, 121);
            g.setColor(grass);
            g.fillRect(0, 416, 500, 500);

            g.setColor(Color.GREEN);
            g.fillRect(225, 345, 45, 70);

            Color teal = new Color(0, 128, 128);
            g.setColor(teal);
            g.drawLine(125, 215, 250, 40);

            g.setColor(teal);
            g.drawLine(375, 215, 250, 40);

            Color pink = new Color(255, 196, 209);
            g.setColor(pink);
            g.fillArc(140,240,50,50,0,360);//Left Window
            g.fillArc(310,240,50,50,0,360);//Right Window
        }
    }
}
