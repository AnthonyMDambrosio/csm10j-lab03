/*
    Programmer : Anthony D'Ambrosio

    Date       : 9/13/2015

    Purpose    : This program gets two numbers and displays the odds, 
                 and sums the evens by using do while loops.

    Limitations: The user may encounter errors when entering a value for 
                 firstNum/secondNum that is not an int, or a negative number.
*/

//package lab03_b_dowhile;
import java.util.*;

public class Lab03_B_DoWhile 
{
    static Scanner console = new Scanner( System.in );
    
    public static void main( String[] args ) 
    {
        
        // Creating variables
        int firstNum = 0, 
            secondNum = 0,
            counter = 0,
            sum = 0,
            difference;
     
         boolean goForward = false;
     
         
        // This first do while loop gets input for firstNum/secondNum,
        // and also makes sure that firstNum is smaller than secondNum.
        do 
        {
            
            System.out.print( "Input the first number: " );
            firstNum = console.nextInt();
            System.out.print( "Input the second number: " );
            secondNum = console.nextInt();
            System.out.println();
            
            if ( firstNum > secondNum )
                System.out.println( "The first number must be smaller "
                        + "than the second number." );
            else if ( firstNum < secondNum )
                goForward = true;
            
        } while ( goForward == false );   
        
        
        
        // difference is used as a check for the next do while loop.
        difference = ( secondNum - firstNum );
        
        
        // First we print the odds.
        System.out.println( "All odd numbers between " + firstNum + " and " 
                        + secondNum + " inclusive" );
        
        
        // Prints the odds and sums the evens.
        do 
        {
            if ( ( ( firstNum + counter ) % 2)  == 1 )
                System.out.println(firstNum + counter);
            else 
                sum = sum + ( firstNum + counter );
          
            counter++;
        } while ( counter <= difference );
        
        
        
        // Prints the evens. 
        System.out.println();
        System.out.println( "Sum of all even numbers between " + firstNum 
                        + " and " + secondNum + " inclusive" );
        System.out.println( sum );
        
    }
    
}
