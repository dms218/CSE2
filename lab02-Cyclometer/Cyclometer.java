//Dean Shafritz 
//Thursday September 3, 2015
//CSE 002
//Cyclometer Program 
//This program should print the number of minutes for each trip,
//print the number of counts for each trip, 
//print the distance of each trip in miles,
//and print the distance for the two trip combined.

public class Cyclometer{
    
    //main method required for every java program
    public static void main(String [] args){
        
        int secsTrip1=480; //time that trip one took
        int secsTrip2=3220; //time that trip two took
        int countsTrip1=1561; //number of rotations in trip one
        int countsTrip2=9037; //number of rotions in trip two
        double wheelDiameter=27.0,
        PI=3.14159, //necessary to calculate the distance of the trip
            feetPerMile=5280, //necessary to calculate the distance of the trip
            inchesPerFoot=12, //necessary for converting distance to miles
            secondsPerMinute=60; //necessary to calculate the time the trip took
            double distanceTrip1, distanceTrip2,totalDistance;
        
        //print out the output data
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}