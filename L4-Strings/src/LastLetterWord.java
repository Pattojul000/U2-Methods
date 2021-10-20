import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing


    The Plan:
           1. Get input: three words input
           2. Isolate the last three letters of any word
           3.Combine #2 of all three words



    */

    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("Enter word 1: ");
        String word2 = JOptionPane.showInputDialog("Enter word 2: ");
        String word3 = JOptionPane.showInputDialog("Enter word 3: ");

        String output = lastThree(word1) + lastThree(word2) + lastThree(word3);

        JOptionPane.showMessageDialog(null, output);

    }


    public static String lastThree(String word){

        return word.substring(word.length()-3);
    }
}
