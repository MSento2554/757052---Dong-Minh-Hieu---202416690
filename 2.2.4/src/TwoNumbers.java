import javax.swing.JOptionPane;
public class TwoNumbers {
    public static void main(String[] args) {
    String Num1, Num2;
    String strNotification = "You've just entered: ";
    Num1 = JOptionPane.showInputDialog(null, "Please input the first number", JOptionPane.INFORMATION_MESSAGE);
    strNotification += Num1 + " " + "and" + " ";
    Num2 = JOptionPane.showInputDialog(null, "Please input the second number", JOptionPane.INFORMATION_MESSAGE);
    strNotification += Num2;
    double doubleNum1, doubleNum2, add, sub, multi, div;
    doubleNum1= Double.parseDouble(Num1);
    doubleNum2= Double.parseDouble(Num2);
    add = doubleNum1 + doubleNum2;
    sub = doubleNum1 - doubleNum2;
    multi = doubleNum1 * doubleNum2;
    div = 0; 
String results = "Addition: " + add + "\n" +
                 "Subtraction: " + sub + "\n" +
                 "Multiplication: " + multi + "\n";

if (doubleNum2 == 0) {
    results += "Division: Cannot divide by zero!";
} else {
    div = doubleNum1 / doubleNum2;
    results += "Division: " + div;
}

JOptionPane.showMessageDialog(null, results, "Results", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    }


}

