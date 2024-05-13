/*Check for Prime Number
Program to Check if a Number is Prime or Not*/

package assignmentATB;
import java.util.Scanner;
public class Assignment7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int number = sc.nextInt();
            sc.close();

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number/2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Number is prime: " + number);
            } else {
                System.out.println("Number is not prime");
            }
        }
    }

