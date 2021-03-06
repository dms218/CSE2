//Dean Shafritz
//Calculator Java Program
//September 17, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class Calculator {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        System.out.print("Enter the first value (a): ");
        int a = myScanner.nextInt(); //scanner variable for a
        System.out.print("Enter the second value (b): ");
        int b = myScanner.nextInt(); //scanner variable for b
        System.out.print("Enter the operator (*,/,+,-): ");
        char operator = myScanner.next().charAt(0); //scanner variable for operator
        double result=0;
        
        switch (operator) {
            case '*':
                result = a*b;
            break;
            case '/':
                result = a/b;
            break;
            case '+':
                result = a+b;
            break;
            case '-':
                result = a-b;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println("The result is "+result);
    }
}
        