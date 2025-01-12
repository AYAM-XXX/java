package conceitos.math;

import java.util.Random;
import javax.swing.JOptionPane;

public class math {
    public static void main(String[] args) {
        // double n = 3.24;
        // double j = -4;
        // double k = Math.max(n, j); // highest value
        // double p = Math.min(n, j); // lowest value
        // double l = Math.abs(j);  // absolute value
        // double t = Math.sqrt(Math.abs(j)); //square
        // double g = Math.ceil(n); // up
        // double h = Math.floor(n); // up

        System.out.println();
        Double x = Double.parseDouble(JOptionPane.showInputDialog("enter size x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("enter size y: "));
        double tr = Math.sqrt((x * x) + (y * y));
        // radom values
        Random radom = new Random();
        int rd = radom.nextInt(9);
        JOptionPane.showMessageDialog(null, "Radom value: " + rd + "\nhip : " + tr);
    }
}
