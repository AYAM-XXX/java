package conceitos.switchJav;

import javax.swing.JOptionPane;

public class switchapp {
    public static void main(String[] args) {
        String day = JOptionPane.showInputDialog(null, "Enter day: ");
        switch (day) {
            case "sunday":
                JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            case "monday":
                JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            case "tuersday":
                JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            case "wednesday":
                JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            case "thursday":
            JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            case "friday":
            JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            case "saturday":
                JOptionPane.showMessageDialog(null, "its " + day + " !!!");
                break;
            default:
            JOptionPane.showMessageDialog(null, "Erro :/");
            break;

        }
    }

}
// javac conceitos/switchJav/switchapp.java
// java conceitos.switchJav.switchapp
