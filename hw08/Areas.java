//Dean Shafritz
//Areas Java Program
//October 27, 2015
//CSE 002

//initialize the scanner
import java.util.Scanner;

//define a class
public class Areas {
    
    
    public static void main(String[] args) {
        boolean a = true;
        while (a){
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter (1) for circle, (2) for rectangle, (3) for trapezoid, or (4) to exit: ");
        int x = scan.nextInt();
        if (x == 1){
            System.out.println("Enter a value for the radius: ");
            double x1 = scan.nextInt();
            System.out.println("The area of the circle is "+area(x1));
        }
        else if (x == 2){
            System.out.println("Enter a value for the length: ");
            double y1 = scan.nextInt();
            System.out.println("Enter a value for the width: ");
            double y2 = scan.nextInt();
            System.out.println("The area of the rectangle is "+area(y1, y2));
        }
        else if (x == 3){
            System.out.println("Enter a value for base 1: ");
            double z1 = scan.nextInt();
            System.out.println("Enter a value for base 2: ");
            double z2 = scan.nextInt();
            System.out.println("Enter a value for the height: ");
            double z3 = scan.nextInt();
            System.out.println("The area of the trapezoid is "+area(z1, z2, z3));
        }
        else if (x == 4){
            a = false;
        }
        }
        
    }
    
    public static double area(double r){
        double circle = Math.PI * Math.pow(r, 2);
        return circle;
    }
    
    public static double area(double l, double w){
        double rectangle = l*w;
        return rectangle;
    }
    
    public static double area(double h, double b1, double b2){
        double trapezoid = ((b1+b2)/2)*h;
        return trapezoid;
    }
}