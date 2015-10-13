/**
 * Mpg.java
 * author: Jack MacVicar
 * 
 * Uses the information given by the user to figure out which car has better gas mileage
 */

import java.util.Scanner; //imports the scanner class that is used to get user info
import java.text.NumberFormat;//imports number format class so numbers can be properly formatted 
import java.text.DecimalFormat; //imports decimal format class so numbers can be properly formatted 


public class Mpg
{
    public static void main (String[] args)
    {
        //set variables needed for the program 
        float mpg, amountOfGas, totalCost, costOfGas;
        int odometerBeg, odometerEnd, distanceTraveled;
        Scanner scan = new Scanner (System.in);
        
        //gets information needed from the user
        System.out.print("Enter total amount of gas used (in gallons): ");
        amountOfGas = scan.nextFloat();
        
        System.out.print("Enter odometer reading at the beginning of trip: ");
        odometerBeg = scan.nextInt();
        
        System.out.print("Enter odometer readong at the end of trip: ");
        odometerEnd = scan.nextInt();
        
        System.out.print("Enter cost of gas per gallon (In dollars): ");
        costOfGas = scan.nextFloat();
        
        
        distanceTraveled = (odometerEnd - odometerBeg);//calulates the distance traveled
        totalCost = distanceTraveled * costOfGas;//calculates the total cost of gas for the trip
        mpg = distanceTraveled / amountOfGas;//calsulated the mpg that the car gets 
        
        //prints output with appropriate formating 
        NumberFormat money = NumberFormat.getCurrencyInstance(); //currency format
        DecimalFormat fmt = new DecimalFormat ("0.##");//decimal format
        
        //prints the output to the screen 
        System.out.println("****************************************************************\nYou have spent " + money.format(totalCost) +
        " to travel " + distanceTraveled + " miles.\n" + "Your miles per gallon would be " + fmt.format(mpg) + ".\n" + 
        "****************************************************************");
        
    }
}
        
        
        
       
        
        
        
