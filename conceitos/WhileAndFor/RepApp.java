package conceitos.WhileAndFor;

import javax.swing.JOptionPane;

public class RepApp {
    public static void main(String[] args) {
        String name = "";
        do {
            name = JOptionPane.showInputDialog("Enter your name: ");
        } while (name.isBlank());
        // while (name.isBlank()) {
        //     name = JOptionPane.showInputDialog("Enter your name: ");
        // }
    }
}
