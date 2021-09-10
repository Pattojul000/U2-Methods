import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {

    static double price16 = 0.75;
    static double price20 = 0.99;
    static double tax = 7.5;
    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {

        int num16 = Integer.parseInt(JOptionPane.showInputDialog("How many 16oz cups?"));
        int num20 = Integer.parseInt(JOptionPane.showInputDialog("How many 20oz cups?"));

        calculateCost(num16, num20);

        System.exit(0);
    }

    public static void calculateCost(int num16, int num20) {
        DecimalFormat round = new DecimalFormat("#,###.00");


        double cost16 = num16 * price16;
        double cost20 = num20 * price20;

        double total16 = cost16 * (1 + (tax / 100.00));
        double total20 = cost20 * (1 + (tax / 100.00));

        double total = total16 + total20;

        String message = "Your Order: ";
        message += "\n16 oz: " + num16;
        message += "\n20oz: " + num20;
        message +="\n\tTotal Cost: " + round.format(total);


        JOptionPane.showMessageDialog(null, message);
    }
}
