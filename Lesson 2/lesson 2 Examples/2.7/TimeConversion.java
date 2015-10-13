//TimeConversion.java

import java.util.Scanner;

public class TimeConversion
{
    public static void main (String[] args)
    {
        int seconds, minutes, hours, seconds2, leftover;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("What is your time in seconds: ");
        seconds = scan.nextInt();
        
        hours = seconds/(3600);
        leftover = seconds % 3600;
        
        minutes = leftover/60;
        leftover = leftover % 60;
        
        seconds = leftover;
        
        System.out.print(seconds + " seconds equals " + hours + " hours " + minutes + " minutes and " + leftover + " seconds leftover");


    }
}
        
