import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
 JFrame window;
 JPanel panel;
 JButton colorSwitch;
 JButton colorSwitch2;
 JButton colorSwitch3;

 Color panelBackground = new Color(201, 26, 26);
 Color buttonForeground = new Color(33, 34, 56);
 Color buttonBackground = new Color(156, 183, 26);

 //Declare your frame, panel and three buttons.
    public ColorSwitchGUI(){
        //create your GUI
        window = new JFrame("Color Switcher");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorSwitch = new JButton("Switch the Color!");
        colorSwitch2 = new JButton("SWITCH!");
        colorSwitch3 = new JButton("SWITCH!");

        colorSwitch.addActionListener(new colorSwitcher1());
        colorSwitch2.addActionListener(new colorSwitcher2());
        colorSwitch3.addActionListener(new colorSwitcher3());



        panel.setBackground(panelBackground);
        colorSwitch.setForeground(buttonForeground);
        colorSwitch.setBackground(buttonBackground);

        panel.add(colorSwitch);
        panel.add(colorSwitch2);
        panel.add(colorSwitch3);
        window.add(panel);

        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
 private class colorSwitcher1 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(panelBackground);
            colorSwitch.setForeground(buttonForeground);
            colorSwitch.setBackground(panelBackground);
        }
    }
    private class colorSwitcher2 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(buttonForeground);
            colorSwitch.setForeground(panelBackground);
            colorSwitch.setBackground(buttonBackground);
        }
    }
    private class colorSwitcher3 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(buttonBackground);
            colorSwitch.setForeground(buttonBackground);
            colorSwitch.setBackground(buttonForeground);
        }
    }
}
