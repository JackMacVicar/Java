//FloatingNumbers.java

import java.util.Scanner;

public class FloatingNumbers
{
    public static void main (String[]args)
    {
        double num1, num2, sum, difference, product;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter in a floating point number: ");
        num1 = scan.nextDouble();
        
        System.out.print("Enter in another floating point number: ");
        num2 = scan.nextDouble();
        
        sum = (num1 + num2);
        difference = (num1 - num2);
        product = (num1 * num2);
        
        System.out.println ("The sum of the two numbers is: " + sum);
        System.out.println ("The difference of the two numbers is: " + difference);
        System.out.println ("The product of the two numbers is: " + product);
    }
}
        
        
        