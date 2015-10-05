//Dean Shafritz
//Pyramid Java Program
//October 4, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class Pyramid {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        System.out.print("What size pyramid?: ");
            int a = myScanner.nextInt(); //scanner variable for a
            
        for (int b=0;b<a;b++) {
            for (int c=0;c<a-b;c++) {
                System.out.print(" ");
            }
        
        for(int d=0;d<=b;d++) {
            System.out.print("* ");
        }
        
            System.out.println();  
        } 
    }
}