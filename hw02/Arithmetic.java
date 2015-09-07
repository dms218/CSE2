//Dean Shafritz
//Arithmetic Java Program
//September 6, 2015
//CSE 002

//define a class
public class Arithmetic {
    
    //add main method
    public static void main(String[] args) {
        
        //Input Variables
        
        int nSocks=3;   //Number of pairs of socks
        double sockCost$=2.58;  //Cost per pair of socks (‘$’ is part of the variable name)
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1;   //Number of boxes of envelopes
        double envelopeCost$=3.25;  //cost per box of envelopes
        double taxPercent=0.06; //PA sales tax
        
        double totalSockCost$; //total cost of socks
        double totalGlassCost$; //total cost of drinking glasses
        double totalEnvelopeCost$; //total cost of envelopes
        double sockTax; //tax on socks
        double newSock; 
        double sockRound;
        double glassTax; //tax on glasses
        double newGlass;
        double glassRound;
        double envelopeTax; //tax on envelope
        double newEnvelope;
        double envelopeRound;
        double endPriceWithTax; //final price with tax
        double endPriceNoTax; //final price without tax
        double newEnd;
        double endRound;
        
        
        //calculations
        totalSockCost$ = nSocks*sockCost$;
        totalGlassCost$ = nGlasses*glassCost$;
        totalEnvelopeCost$ = nEnvelopes*envelopeCost$;
        
        sockTax = totalSockCost$*taxPercent;
        newSock = Math.round(sockTax*100); //round decimal
            sockRound = newSock/100;
            
        glassTax = totalGlassCost$*taxPercent;
        newGlass = Math.round(glassTax*100); //round decimal
            glassRound = newGlass/100;
            
        envelopeTax = totalEnvelopeCost$*taxPercent;
        newEnvelope = Math.round(envelopeTax*100); //round decimal
            envelopeRound = newEnvelope/100;
        
        endPriceNoTax = totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        
        endPriceWithTax = (totalSockCost$+sockTax) + (totalEnvelopeCost$+envelopeTax) + (totalGlassCost$+glassTax);
        newEnd = Math.round(endPriceWithTax*100); //round decimal
            endRound = newEnd/100;
        
        //Print the Statement
        System.out.println("The price of socks before tax is $"+totalSockCost$+".");
        System.out.println("The price of the drinking glasses before tax is $"+totalGlassCost$+".");
        System.out.println("The price of envelopes before tax is $"+totalEnvelopeCost$+".");
        System.out.println("The tax on the socks is $"+sockRound+".");
        System.out.println("The tax on the drinking glasses is $"+glassRound+".");
        System.out.println("The tax on the envelopes is $"+envelopeRound+".");
        System.out.println("The total cost of the purchase before tax is $"+endPriceNoTax+".");
        System.out.println("The total cost of the purchase after tax is $"+endRound+".");



    }
    
}