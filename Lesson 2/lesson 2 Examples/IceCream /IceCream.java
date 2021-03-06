/**
 * IceCream.java                    Author: Jack MacVicar
 * 
 * Demonstrates the use of enumerated types
 */

public class IceCream
{
    enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, Coffee,
        rockyRoad, mintChocolateChip, cookieDough}
        
        //creates and uses variables of the Flavor type
        public static void main (String[] args)
        {
            Flavor cone1, cone2, cone3;
            
            cone1 = Flavor.rockyRoad;
            cone2 = Flavor.chocolate;
            
            System.out.println ("cone1: " + cone1);
            System.out.println ("cone2: " + cone2);
            
            cone3 = cone1;
            
            System.out.println ("cone3: " + cone3);
        }
}
