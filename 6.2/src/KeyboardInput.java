import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strName = keyboard.nextLine();

        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();

        System.out.println("How tall are you (in meters)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Mr/Ms " + strName + ", " + iAge + " years old\nYour height is " + dHeight + " meters.");
        
        keyboard.close();
    }
}
