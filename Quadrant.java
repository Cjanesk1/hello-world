/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;
       
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Please prompt an X coordinate: ");  //prompt the user for an x-coordinate
        x = keys.nextDouble();
        System.out.println("Please prompt a Y coordinate: ");  //prompt the user for a y-coordinate
        y = keys.nextDouble();
        keys.close();
        
        //determine the quadrant in which the user's order pair lies
        if ( x > 0 && y > 0) {
            System.out.println(" Your point is in th first quadrant!?");
        }
        else if ( x > 0 && y < 0) {
            System.out.println(" Your point is in the F0urth quadrant");
        }
        else if ( x < 0 && y > 0 ) {
            System.out.println(" Your point is in the second quadrant");
        }    
        else if ( x < 0 && y < 0 ) {
            System.out.println("Your point is in the third quadrant");
        }    
        else if ( y == 0 || x == 0) {
            if (x == 0) {
                System.out.println("your point is on the X Axis, and therefore not in a Qaudrant");
            }
            if (y == 0) {
                System.out.println("Your point is somewhere on the Y axis, and is not in a Quadrant");
            }
        }    
        //output the result to the user
        System.out.println("doinkers");
    }
}