//Dean Shafritz
//Arithmetic Java Program
//September 15, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class Block {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        System.out.print("Enter the length of the block: "); //user enters the length
        double length = myScanner.nextDouble(); //scanner variable for length
        System.out.print("Enter the width of the block: "); //user enters the width
        double width = myScanner.nextDouble(); //scanner variable for width
        System.out.print("Enter the height of the block: "); //user enters the height
        double height = myScanner.nextDouble(); //scanner variable for height
        
        double volume;
        double surfacearea;
        
        volume = length*width*height;
        surfacearea = 2*(length*width + length*height + width*height);
        
        System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+".");
        System.out.println("The surface area of the block is "+surfacearea+".");
    }
}