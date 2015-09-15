/*
    Programmer : Anthony D'Ambrosio

    Date       : 9/13/2015

    Purpose    : This program calculates the cost of a fax.

    Limitations: The user may encounter errors when entering a value for 
                 numFax that is not an int, or a negative number.
*/

//package lab03_a;
import java.util.*;

public class Lab03_A
{
    static Scanner console = new Scanner( System.in );
    
    public static void main( String[] args )
    {
        
        // Creating variables.
       final double InternationalFaxCost = 3.00;
       double faxCost = InternationalFaxCost;
       int numFax;
       
       
       // Gets input from the user for the amount of pages to fax.
       System.out.print( "How many pages to fax? " );
       numFax = console.nextInt();
            
       
       // This if statement checks to see if numFax is greater than 0.
       if ( numFax > 0 ) 
       {
           // Calculates when numFax is below 10 pages.
           if ( numFax <= 10 )
                faxCost = ( faxCost + 0.20 );
           // Calculates when numFax is greater than 10 pages. 
           else
                faxCost = ( faxCost + 0.20 ) + ( ( numFax - 10 ) * ( 0.10 ) );
     
           // Prints the total cost out to the user. 
            System.out.printf( "That will cost $%.2f", faxCost );
            System.out.println();
       }
       
    }        
    
}
