/*Java Program with If Loop
Positive / Negative Number
Program to Check if a Number is Positive, Negative, or Zero.*/

package assignmentATB;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        sc.close();
        // Check if the number is negative, zero, or positive
        if (a < 0) {
            System.out.println("The number is negative");
        } else if (a == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is positive");
        }
    }
}
