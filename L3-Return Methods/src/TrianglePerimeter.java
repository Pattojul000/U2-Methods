import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */

    /*
        Get inputs - coordinates; x1, y1, x2, y2, x3, y3
        Calculate distances = 1,2; 2,3; 3,1;
        Calculate perimeter
        Display results - round to 2 decimals

     */

    public static void main(String[] args) {

        int x1 = getInput("Point 1, x-coordinate:");
        int y1 = getInput("Point 1, y-coordinate:");

        int x2 = getInput("Point 1, x-coordinate:");
        int y2 = getInput("Point 1, y-coordinate:");

        int x3 = getInput("Point 1, x-coordinate:");
        int y3 = getInput("Point 1, y-coordinate:");

        double distance1 = distance(x1, x2, y1, y2);
        double distance2 = distance(x2, x3, y2, y3);
        double distance3 = distance(x1, x3, y1, y3);

        double perimeter = triPerimeter(distance1, distance2, distance3);

        outputResults(perimeter);

        System.exit(0);
    }

    //Input Method
    public static int getInput(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    //Distance Method
    public static double distance(int x1, int x2, int y1, int y2){

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    //Perimeter Method
    public static double triPerimeter(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }
    //Output
    public static void outputResults(double perimeter){

        DecimalFormat round = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "The perimeter is " + round.format(perimeter));
    }


}
