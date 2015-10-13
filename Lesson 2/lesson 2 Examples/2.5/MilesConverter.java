//MilesConverter.java

import java.util.Scanner;

public class MilesConverter
{
    public static void main (String[] args)
    {
        double miles, kilometers;
        final double CONVERSION = 1.60935;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("What is your distance in miles: ");
        miles = scan.nextDouble();
        
        kilometers = miles * CONVERSION;
        
        System.out.print("Your distance in kilometers is: " + kilometers);
    }
}
        
