import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static JTextField inputField1, inputField2;
    static JLabel answerLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calculator!");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        answerLabel = new JLabel("0.00");

        JButton addition = new JButton("Add");
        JButton subtraction = new JButton("Subtract");
        JButton multiplication = new JButton("Multiply");
        JButton division = new JButton("Dividing");


        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        addition.addActionListener(new additionListener());
        subtraction.addActionListener(new subtractionListener());
        multiplication.addActionListener(new multiplicationListener());
        division.addActionListener(new divisionListener());


        panel.add(inputLabel1);
        panel.add(inputLabel2);
        panel.add(inputField1);
        panel.add(inputField2);

        panel.add(answerLabel);

        panel.add(subtraction);
        panel.add(addition);
        panel.add(multiplication);
        panel.add(division);


        window.add(panel);
        window.setVisible(true);
    }

    private static class additionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            answerLabel.setText(String.valueOf(number1 + number2));

        }
    }

    private static class subtractionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            answerLabel.setText(String.valueOf(number1 - number2));        }
    }

    private static class multiplicationListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            answerLabel.setText(String.valueOf(number1 * number2));
        }
    }

    private static class divisionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            answerLabel.setText(String.valueOf(number1 / number2));
        }
    }
}