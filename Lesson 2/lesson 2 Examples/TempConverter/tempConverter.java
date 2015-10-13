
/**
 * TempConverter.java                               Author: Jack MacVicar
 * 
 * Demonstrates the use of primitive data tyes and arithmatic expressions
 */

public class tempConverter 
{
    //Computes the fahrenheit equivalent of a specific celsius 
    //value using the formula F = (9/5)c + 32
    
    public static void main (String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        
        int CelsiusTemp = 24; // Value to convert 
        double fahrenheitTemp;
        
        fahrenheitTemp = CelsiusTemp * CONVERSION_FACTOR + BASE;
        
        System.out.println ("Celsius Temperature: " + CelsiusTemp);
        System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}
    
   