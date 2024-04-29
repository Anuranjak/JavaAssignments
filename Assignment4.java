/*Largest in Three Number
Program to Find the Largest Among Three Numbers:*/

package assignmentATB;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a==b && b==c) {
            System.out.println("all three numbers are equal");
        } else if (a>b && a>c) {
            System.out.println("a is largest of all " + a);
        } else if(b>a && b>c){
            System.out.println("b is largest of all " + b);
        }else {
            System.out.println("c is largest of all " +c);
        }
    }
}

