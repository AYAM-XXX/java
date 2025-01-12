package conceitos.string.exercises;

import javax.swing.JOptionPane;

public class concatenate {
    public static void main(String[] args) {
        String phrase_one = JOptionPane.showInputDialog("enter a phrase: ");
        String phrase_two = JOptionPane.showInputDialog("enter a phrase: ");

        JOptionPane.showMessageDialog(null, phrase_one + " " + phrase_two);
    }
}
