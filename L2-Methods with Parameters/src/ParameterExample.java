import javax.swing.*;

public class ParameterExample {

    public static void main(String[] args) {

        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width?"));
        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));

        areaRec(width, length);
        perimeterRec(width, length);
    }

    public static void areaRec(double width, double length){

        double area = width * length;
        JOptionPane.showMessageDialog(null, "The area is " + area);
    }

    public static void perimeterRec(double width, double length){

        double perimeter = 2 * width + 2 *  length;
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter);
    }
}
