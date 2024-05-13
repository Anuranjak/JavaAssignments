/*Leap Year Program - 2024

Program to Check if a Year is a Leap Year or Not */
package assignmentATB;
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        sc.close();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.printf("%d is a leap year%n", year);
        } else {
            System.out.printf("%d is not a leap year%n", year);
        }
    }

}
