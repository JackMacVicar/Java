//writes the average of three numbers

import java.util.Scanner;

public class Average
{
    public static void main (String[] args){
    int a, b, c, average;
    Scanner scan = new Scanner(System.in);
    
    System.out.print ("Enter a number 1 of 3 numbers to be averaged together: ");
    a = scan.nextInt();
    
    System.out.print ("Enter the second number of 3 numbers to be averaged together: ");
    b = scan.nextInt();
    
    System.out.print ("Enter the third number of 3 numbers to be averaged together: ");
    c = scan.nextInt();
    
    average = ((a + b + c) / 3);
    System.out.println ("The average of all of the numbers is: " + average);
}
}