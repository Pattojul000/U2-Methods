import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop

    1. Get input - pword
    2. Isolate the P
    3. Grab the three letters after the P
    4. Output results
     */


    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word with the letter p in it. ");

        JOptionPane.showMessageDialog(null, pword(word));
    }

    public static String pword(String word){
        int pIndex = word.indexOf('p');

        return word.substring(pIndex, pIndex + 4);



    }


}
