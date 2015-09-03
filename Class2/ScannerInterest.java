import java.until.Scanner;

public class ScannerInterest
{
    public static void main(String[] args)
    {
        System.out.println("Enter the account ballance ");
        Scanner scan = new Scanner(System.in);
        int accountballance = scan.nextInt();
        System.out.println("Enter the interest rate ");
        int interestrate = scan.nextInt();
        int answer = accountballance*interestrate + accountballance;
        System.out.println("The final price is " + answer);
    }
    
}