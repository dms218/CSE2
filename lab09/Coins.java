//Dean Shafritz
//Flip Java Program
//October 22, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class Coins {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        while (a){
            System.out.println("Enter number of flips: ");
            int x = scan.nextInt();
            if (x>100)
                a = false;
            else
                System.out.println(flip(x));
        }
        
   }
    
    
    public static String flip(){
        double x = Math.random();
        
        if (x > .5)
            return "Heads (0)";
        else
            return "Tails (1)";
    
    }   
    
     public static String flip(int n){
        int h = 0;
        int t = 0;
        
        if(n==0)
            return flip();
        else {
            for (int i = 0; i<n; i++){
                double flip = Math.random();
                if (flip > .5)
                    h++;
                else 
                    t++;
            }
            return "Heads= " +h+ "\nTails= " +t;
        }
     }

}
