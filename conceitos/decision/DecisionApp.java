package conceitos.decision;
import javax.swing.JOptionPane;

public class DecisionApp {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age: "));
        if (age >= 75) {
            JOptionPane.showMessageDialog(null, "you are Boomer");
        } else if (age >= 18) {
            JOptionPane.showMessageDialog(null, "you are adult");
        } else {
            JOptionPane.showMessageDialog(null, "you are kid or teeneger");
        }
        String rd = JOptionPane.showInputDialog("enter A: ");
        if (rd.equals("a")) {
            JOptionPane.showMessageDialog(null, "AAAAAAA");
        }else{
            JOptionPane.showMessageDialog(null, "NO AAAAAAA");
        }
    }
    
} // javac conceitos/decision/DecisionApp.java // java conceitos.decision.DecisionApp

// .equals for compare 2 value of same vaue