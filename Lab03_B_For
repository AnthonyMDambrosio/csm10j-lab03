/*
    Programmer : Anthony D'Ambrosio

    Date       : 9/13/2015

    Purpose    : This program gets two numbers and displays the odds, 
                 and sums the evens by using for loops.

    Limitations: The user may encounter errors when entering a value for 
                 firstNum/secondNum that is not an int, or a negative number.
*/

//package lab03_b_for;
import java.util.*;

public class Lab03_B_For 
{
    static Scanner console = new Scanner ( System.in );
    public static void main( String[] args ) 
    {
        // Establishes variables. 
         int firstNum = 0, 
            secondNum = 0,
            sum = 0,
            difference;
        
         
        // This for loops gets input for firstNum/secondNum and makes sure that
        // firstNum is smaller than secondNum.
        for ( boolean goForward = false; goForward == false; )
        {
            System.out.print( "Input the first number: " );
            firstNum = console.nextInt();
            
            System.out.print( "Input the second number: " );
            secondNum = console.nextInt();
            System.out.println();
            
            if (firstNum > secondNum)
            {
                System.out.println("The first number must be smaller "
                        + "than the second number.");
            } else
                goForward = true;
        }
        
        
        // difference is a check for the next for loop.
        difference = (secondNum - firstNum);
        
        
        // First we do odds.
        System.out.println("All odd numbers between " + firstNum + " and " 
                        + secondNum + " inclusive");
        
        
        // Prints out data for the odds and sums the evens.
        for ( int counter = 0; counter <= difference; counter ++ )
        {
             if ( ( ( firstNum + counter ) % 2 )  == 1 )
                System.out.println( firstNum + counter );
             else 
                sum = sum + ( firstNum + counter );
        }
        
        
        // Prints out the data for the sum of all evens.
        System.out.println();
        System.out.println( "Sum of all even numbers between " + firstNum 
                        + " and " + secondNum + " inclusive" );
        System.out.println( sum );
        
    }
    
}
