/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int m;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Can you Please give ya birf month in numbers.");  //prompt the user for a birth month
        m = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month 
        if ( m == 1 || m == 3 || m == 5 || m== 7 || m==8 || m==10 || m==12) {
            System.out.println("Your B-Day Month has 31 Days!");
        }
        else if (m == 2) {
            System.out.println("Your Birthday month has 28 days");
        }
        else if (m== 4 || m== 6 || m==9 || m== 11) {
            System.out.println("Your b-day month has 30 days!");
        }    
        
        
        //output the result to the user
        System.out.println("um");
    }
}