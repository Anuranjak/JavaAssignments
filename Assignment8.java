/*Write a program that prints numbers from 1 to 100. However,
for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
For numbers that are multiples of both 3 and 5, print "FizzBuzz."
 */

package assignmentATB;
public class Assignment8 {
    public static void main(String[] args){
        int i;
        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                fizzBuzzCount++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                fizzCount++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                buzzCount++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Fizz count: " + fizzCount);
        System.out.println("Buzz count: " + buzzCount);
        System.out.println("FizzBuzz count: " + fizzBuzzCount);
    }
}


