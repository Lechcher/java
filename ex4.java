import javax.swing.JOptionPane;

public class ex4
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your age is " + age + " years old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height: "));
        JOptionPane.showMessageDialog(null, " Your height is " + height);
        
    }

}