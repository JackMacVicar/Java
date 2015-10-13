//********************************************************************
// TriangleArea.java       
// D. Maguire
// September 2011
// Demonstrates the creation computation of the area of a triangle
//********************************************************************
import java.util.Scanner;          // Allows user input.
import java.text.DecimalFormat;    // Allows decimal output to be formatted.

public class TriangleArea
{
   //-----------------------------------------------------------------
   //  Allows user to input sides and then figures area of triangle.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
    double a, b, c;   // three sides of the triangle
    double s;        // 1/2 of perimeter of triangle
    double area;     // area of triangle
    Scanner scan = new Scanner(System.in);  // Assigns input to new object.
     
    // Input of 3 sides by user and assign to variables.
    System.out.print(" Enter the first side of the triangle :");
    a= scan.nextDouble();
    System.out.print(" Enter the second side of the triangle :");
    b= scan.nextDouble();
    System.out.print(" Enter the third side of the triangle :");
    c= scan.nextDouble();
     
    // Do calculations.
    s= (a + b + c) / 2; 
    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
     
    // Set the decimal format to 3 places.
    DecimalFormat fmt = new DecimalFormat("0.###"); // Will show 3 decimals
	
     
    // Output the area.
    System.out.println("The area of your triangle is:" + fmt.format(area));   
    } 
}