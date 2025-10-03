import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNum = -1, year = -1;

        while (monthNum == -1) {
            System.out.print("Enter month: ");
            String monthInput = sc.nextLine();
            monthNum = getMonthNumber(monthInput);

            if (monthNum == -1) {
                System.out.println("Invalid month. Try again.");
            }
        }

        while (year < 0) {
            System.out.print("Enter year: ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year < 0) {
                    System.out.println("Year cannot be negative. Try again.");
                }
            } else {
                System.out.println("Invalid year. Enter digits only.");
                sc.next();
            }
        }

        int days = getDaysInMonth(monthNum, year);
        String monthName = getMonthName(monthNum);

        System.out.println(monthName + " " + year + " has " + days + " days.");
        sc.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static int getMonthNumber(String monthInput) {
        monthInput = monthInput.trim().toLowerCase();

        switch (monthInput) {
            case "1": case "january": case "jan": case "jan.":
                return 1;
            case "2": case "february": case "feb": case "feb.":
                return 2;
            case "3": case "march": case "mar": case "mar.":
                return 3;
            case "4": case "april": case "apr": case "apr.":
                return 4;
            case "5": case "may":
                return 5;
            case "6": case "june": case "jun": case "jun.":
                return 6;
            case "7": case "july": case "jul": case "jul.":
                return 7;
            case "8": case "august": case "aug": case "aug.":
                return 8;
            case "9": case "september": case "sep": case "sept": case "sept.":
                return 9;
            case "10": case "october": case "oct": case "oct.":
                return 10;
            case "11": case "november": case "nov": case "nov.":
                return 11;
            case "12": case "december": case "dec": case "dec.":
                return 12;
            default:
                return -1;
        }
    }

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}
