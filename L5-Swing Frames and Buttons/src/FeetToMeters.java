import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
    1. Create GUI
    2. Get Input
    3. The Math
    F to M = Divide by 3.28
    M to F = Multiply by 3.28
     */
    public static void main(String[] args) {

        JFrame window = new JFrame("Distances");
        JPanel panel = new JPanel();
        JButton ft2M = new JButton("Feet to Meters");
        JButton m2Ft = new JButton("Meters to Feet");

        window.setSize(600,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        ft2M.addActionListener(new FeetToMetersListener());
        m2Ft.addActionListener(new MetersToFeetListener());

        panel.add(ft2M);
        panel.add(m2Ft);

        window.add(panel);
        window.setVisible(true);

    }

    private static class FeetToMetersListener implements ActionListener {

        public void actionPerformed(ActionEvent e){

            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the feet: "));

            double result = number / 3.28;

            JOptionPane.showMessageDialog(null, result + " in meters.");
        }
    }

    private static class MetersToFeetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the meters: "));

            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + " in feet.");
        }
    }
}


