package conceitos.GUI;
import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter you name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, " welcome " + name + " !\n" + "age :" + age);
    }
}
