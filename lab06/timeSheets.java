//Dean Shafritz
//Time Sheet Java Program
//October 1, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class timeSheets {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        System.out.print("Enter the number of employees: ");
            int a = myScanner.nextInt(); //scanner variable for a
        
        int i = 0;
        double total = 0;
        
        while (i<a){
            
            System.out.print("Enter the pay per hour in cents: ");
            int cents = myScanner.nextInt(); //scanner variable for cents
            
            cents = cents/100;
            
            System.out.print("Enter the hours worked on Monday: ");
            int mon = myScanner.nextInt(); //scanner variable for mon
            System.out.print("Enter the hours worked on Tuesday: ");
            int tues = myScanner.nextInt(); //scanner variable for tues
            System.out.print("Enter the hours worked on Wednesday: ");
            int wed = myScanner.nextInt(); //scanner variable for wed
            System.out.print("Enter the hours worked on Thursday: ");
            int thurs = myScanner.nextInt(); //scanner variable for thurs
            System.out.print("Enter the hours worked on Friday: ");
            int fri = myScanner.nextInt(); //scanner variable for fri
            
            total = total + ((mon*cents) + (tues*cents) + (wed*cents) + (thurs*cents) + (fri*cents));
            
            i++;
        }
        System.out.println("The total payroll for all emploeeys is "+total);
    }
}
        