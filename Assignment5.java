/*Check char is vowel, consonant.
Program to Check if a Character is a Vowel or a Consonant.*/

package assignmentATB;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        // Read a string from the user
        String input = sc.next();

        // Extract the first character from the input
        char ch = input.charAt(0);
        sc.close();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("character is a vowel");
        } else {
            System.out.println("character is a consonant");
        }
    }
}
