/**
 * This program reads a 5-digit number and prints every digit of it in an organized manner.
 *
 * @author (Fikri San Koktas)
 * @version (12 October 2020)
 */
import java.util.Scanner;
public class KFS_BreakInteger_Main
{  
     public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a five digit number: "); // prompts the user to enter a number
        int number = in.nextInt();
        int first = number%10; //calculates the first digit
        int second = (number-first) % 100 / 10; //calculates the second digit
        int third = (number - first - second) % 1000 / 100; //calculates the third digit
        int fourth = ( number - first - second - third ) % 10000 / 1000; //calculates the fourth digit
        int fifth = ( number - first - second - third - fourth) % 100000 / 10000; //calculates the fifth digit
        System.out.print(fifth + " ");
        System.out.print(fourth + " ");
        System.out.print(third + " ");
        System.out.print(second + " ");
        System.out.print(first + " ");
    }
}
