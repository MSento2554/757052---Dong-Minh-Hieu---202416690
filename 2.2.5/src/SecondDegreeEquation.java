import javax.swing.JOptionPane;
public class SecondDegreeEquation {
    public static void main(String [] args) {
        String StrA = JOptionPane.showInputDialog(null, "Please enter a for a*x^2+b*x+c", JOptionPane.INFORMATION_MESSAGE);
        String StrB = JOptionPane.showInputDialog(null, "Please input b for a*x^2+b*x+c", JOptionPane.INFORMATION_MESSAGE);
        String StrC = JOptionPane.showInputDialog(null, "Please input c for for a*x^2+b*x+c", JOptionPane.INFORMATION_MESSAGE);


        
        double a = Double.parseDouble(StrA);
        double b = Double.parseDouble(StrB);
        double c = Double.parseDouble(StrC);
        double result1, result2;
        double alpha = b*b - 4 * a * c;
        if (alpha==0){
            result1= -b/(2*a);
            JOptionPane.showMessageDialog(null, "The equation has one solution" + result1, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (alpha<0){
            JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else{
            result1= (-b + Math.sqrt(alpha))/(2*a);    
            result2= (-b - Math.sqrt(alpha))/(2*a);
            JOptionPane.showMessageDialog(null, "The equation has two solutions" + result1 + "and"+ result2, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}        

