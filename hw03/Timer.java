//Dean Shafritz
//Arithmetic Java Program
//September 15, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class Timer {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        System.out.print("Enter the current time in military time (HHMM): "); //user enters the time
        double time1 = myScanner.nextDouble(); //scanner variable for time
        System.out.print("Enter the time you are eating dinner in military time (HHMM): "); //user enters the time
        double time2 = myScanner.nextDouble(); //scanner variable for time
        
        double time1hours;
        double time1minutes;
        double a;
        double b;
        a = time1/100;
        b = Math.floor(a);
        time1minutes = (a - b)*100;
        time1hours = b;
        
        
        double time2hours;
        double time2minutes;
        double c;
        double d;
        c = time2/100;
        d = Math.floor(c);
        time2minutes = (c - d)*100;
        time2hours = d;
        
        double hoursleft;
        double minutesleft;
        hoursleft = time2hours - time1hours;
        minutesleft = time2minutes - time1minutes;
        
        
        System.out.println("You have "+(Math.floor(hoursleft))+" hours and "+(Math.floor(minutesleft))+" minutes until dinner.");
    }
}   