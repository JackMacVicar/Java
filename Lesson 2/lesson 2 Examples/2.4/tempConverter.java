/**
 * TempConverter.java                               Author: Jack MacVicar
 * 
 * Demonstrates the use of primitive data tyes and arithmatic expressions
 **/

import java.util.Scanner;

public class tempConverter 
{
    //Computes the fahrenheit equivalent of a specific celsius 
    //value using the formula F = (9/5)c + 32
    
    public static void main (String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a temp in Fahrenheit: ");
        double fahrenheitTemp = scan.nextDouble();// Value to convert 
        double CelsiusTemp;
        
        CelsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
        
        System.out.println ("Celsius Temperature: " + CelsiusTemp);
    }
}

