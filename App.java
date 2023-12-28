import javax.swing.JOptionPane;

public class App
{
    public static void main(String[] args)
    {
        int temp;
        
        temp = Integer.parseInt(JOptionPane.showInputDialog("Temperature outside is: "));
        
        if(temp > 30)
        {
            JOptionPane.showMessageDialog(null, "I need a icecream!");
        }
        else if(temp >= 20 && temp <= 30)
        {
            JOptionPane.showMessageDialog(null, "It is so swarm!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "I need a coat!");
        }
    }

}
