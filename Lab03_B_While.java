/*
    Programmer : Anthony D'Ambrosio

    Date       : 9/13/2015

    Purpose    : This program gets two numbers and displays the odds, 
                 and sums the evens by using while loops.

    Limitations: The user may encounter errors when entering a value for 
                 firstNum/secondNum that is not an int, or a negative number.
*/

//package lab03_b_while;
import java.util.*;

public class Lab03_B_While 
{
    static Scanner console = new Scanner( System.in );
    
    public static void main( String[] args ) 
    {
        // Establishing variables.
        int firstNum = 0, 
            secondNum = 0,
            counter = 0,
            sum = 0,
            difference;
        
        boolean goForward = false;
        
        
        // Gets input for firstNum/secondNum and makes sure that
        // firstNum is smaller than secondNum.
        while ( goForward == false )
        {
            System.out.print("Input the first number: ");
            firstNum = console.nextInt();
            System.out.print("Input the second number: ");
            secondNum = console.nextInt();
            System.out.println();
            
            if (firstNum > secondNum)
            {
                System.out.println("The first number must be smaller "
                        + "than the second number.");
            } 
            else if (firstNum < secondNum)
                goForward = true;
        }   
        
        
        // difference is a check variable for the next loop.
        difference = (secondNum - firstNum);
        
        
        // First we do odds.
        System.out.println("All odd numbers between " + firstNum + " and " 
                        + secondNum + " inclusive");
        
        
        // Prints the odds and sums the evens.
        while (counter <= difference)
        {
            if ( ( ( firstNum + counter ) % 2)  == 1 )
                System.out.println( firstNum + counter );
            else
                sum = sum + ( firstNum + counter );
          
            counter++;
        }
        
        
        // Prints the sums of all evens.
        System.out.println();
        System.out.println("Sum of all even numbers between " + firstNum 
                        + " and " + secondNum + " inclusive");
        System.out.println(sum);
        
    }
    
}
