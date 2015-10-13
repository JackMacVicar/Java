//radius.java

import java.util.Scanner;

public class radius
{
    public static void main (String[] args)
    {
        double pi = 3.14;
        double surfaceArea, volume, radius;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Radius of the sphere: ");
        radius = scan.nextDouble();
        
        volume = (4.0/3.0) * pi *(Math.pow(radius, 3.0));
        System.out.println("The volume of the sphere is: " + volume);
        
        surfaceArea = 4 * pi * (Math.pow(radius, 2.0));
        System.out.println("The Surface Area of the sphere is: " + surfaceArea);
    }
}