import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] myArray = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
        }

        Arrays.sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }

        double average = (double) sum / myArray.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}
