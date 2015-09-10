//Dean Shafritz 
//Thursday September 10, 2015
//CSE 002
//Check Program 
//This program should allow the user to input data from a check and 
//calculate the tip on the check, split the check between a given number
//of customers, and display the amount needed to pay by each customer. 

//initialize the scanner
import java.util.Scanner;

public class Check{
    // main method required for every Java program
    public static void main(String[] args) {
    
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //user enters the cost
        double checkCost = myScanner.nextDouble(); //scanner variable for cost
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //user enters the tip
        double tipPercent = myScanner.nextDouble(); //scanner variable for tip
        tipPercent /= 100;  //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: "); //user enters the amount of people
        int numPeople = myScanner.nextInt(); //scanner variable for people
        
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople; //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g.,
        // (int)(6.73 * 10) % 10 > 67 % 10 > 7
        // where the % (mod) operator returns the remainder
        // after the division: 583%100 > 83, 27%5 > 2
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    } //end of main method
} //end of class