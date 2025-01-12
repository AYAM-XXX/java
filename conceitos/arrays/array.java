package conceitos.arrays;

import javax.swing.JOptionPane;

public class array {
    public static void main(String[] args) {
        String console[] = new String[4];

        console[0] = "Xbox";
        console[1] = "ps5";
        console[2] = "nintendo";
        console[3] = "steam deck";

        for (int i = 0; i < console.length; i++) {
            JOptionPane.showMessageDialog(null, console[i]);
        }
    }
}
