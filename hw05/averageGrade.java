//Dean Shafritz
//Average Java Program
//September 24, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class averageGrade {
    
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //this is so java knows you have a scanner in your program
        
        boolean x = true;
        double totalscore = 0;
        double loops = 0;
        double average = 0;
        
        while (x==true){
            System.out.print("Enter a score (0-100) (999 for End): ");
            int a = myScanner.nextInt(); //scanner variable for a
            if (a == 999){
                x = false;
                break;
            }    
            else if (a < 0 || a > 100){
                System.out.println("Invalid Score");
            }
            else {
            totalscore = totalscore + a;   
            loops = loops + 1;
            }
        }
        
        if (totalscore == 0){
            System.out.println("No Score Entered");
        }
        else {
            average = totalscore / loops;
            System.out.println("The average of the scores is " +average);
        }
    }    
}    