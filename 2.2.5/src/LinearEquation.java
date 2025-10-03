import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String [] args) {
        String StrA = JOptionPane.showInputDialog(null, "Please enter a", JOptionPane.INFORMATION_MESSAGE);
        String StrB = JOptionPane.showInputDialog(null, "Please input b", JOptionPane.INFORMATION_MESSAGE);

        
        double a = Double.parseDouble(StrA);
        double b = Double.parseDouble(StrB);

        double result;

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            result = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
