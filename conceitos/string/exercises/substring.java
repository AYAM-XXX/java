package conceitos.string.exercises;

import javax.swing.JOptionPane;

import conceitos.string.stringsmd;

public class substring {
    public static void main(String[] args) {
        String phrase = JOptionPane.showInputDialog("enter a phrase: ");

        String cut = phrase.substring(2, 5);
        JOptionPane.showMessageDialog(null, cut);

    }
}
