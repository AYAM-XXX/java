package conceitos.string.exercises;

import javax.swing.JOptionPane;

public class lexicographically {
    public static void main(String[] args) {
        String phrase_one = JOptionPane.showInputDialog("enter a phrase: ");
        String phrase_two = JOptionPane.showInputDialog("enter a phrase: ");

        if ( phrase_one.equals(phrase_two)) {
            JOptionPane.showMessageDialog(null,phrase_one + " the same as " + phrase_two);
        } else {
            JOptionPane.showMessageDialog(null,phrase_one + " is less than " + phrase_two);
        }
    }
}
