//Max between 3 Numbers with ? operators.
package assignmentATB;
import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Please enter three integers: ");

        // Read the three integers from the user
        int a = abc.nextInt();
        int b = abc.nextInt();
        int c = abc.nextInt();
        // Close the scanner
        abc.close();
        // Use the ternary operator to find the larger number
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("largest no. is: " +max);
    }
}