
/*
 * N0probllama
 * 
 * Speeding Tickets
 * September 19th - 22nd, 2022.
 * 
 * This program uses Boolean operators and nesting If/Else statements to calculate fines for drivers 
 * who are non-compliant with driving laws.
 * 
 * This project is designed to allow users to input driving data to calculate driving fines.
 * Fines are calculated using the driver's speed, the posted speed limit for area and whether the 
 * location is within a school zone or construction zone. 
 * Fines are also calculated for those who drive 20km/hr below the posted speed limit.
 *  
 */

import java.util.Scanner;
public class SpeedingTickets {
    public static void main(String []args) {
        //Scanner utility for reading user input.
        Scanner input = new Scanner(System.in); 

        //Promt user for speed input in km/hr.
        System.out.print("Enter speed driven in km/h: ");
        int speedKmHour = input.nextInt();

        //Promt user for speed limit of the zone.
        System.out.print("Enter speed limit in zone: ");
        int speedLimit = input.nextInt();

        //Promt user for information if school/construction zone.
        System.out.print("Enter if school and/or construction zone. Enter 1 for YES or 2 for NO: ");
        int schoolConstruction = input.nextInt();

        //Declair variables for computing values for speed tickes.

        int speed = speedKmHour - speedLimit;



        // If/Else statments for isolating driver speeds and applicable slow zones.
        System.out.println("Your fine is: ");
        if (speed >= 61) {
            if (schoolConstruction == 1) {
                System.out.println("$483");

            } else if (schoolConstruction == 2) {
                System.out.println("$483");
            }
        } else if (speed >= 41) {
            if (schoolConstruction == 1) {
                System.out.println("$368");

            } else if (schoolConstruction == 2) {
                System.out.println("$368");
            }
        } else if (speed >= 21) {
            if (schoolConstruction == 1) {
                System.out.println("$253");

            } else if (schoolConstruction == 2) {
                System.out.println("$196");
            }      
        } else if (speed >= 1) {
            if (schoolConstruction == 1) {
                System.out.println("$138");

            } else if (schoolConstruction == 2) {
                System.out.println("$196");
            }  
        } else if (speed == 0) {
            if (schoolConstruction == 2) {
                System.out.println("Good job, you're not speeding. No fine for you!");

            } else if (schoolConstruction == 1) {
                System.out.println("Good job, you're not speeding. No fine for you!");
            }   
        } else if (speed <= -20) {
            if (schoolConstruction == 2) {
                System.out.println("$121");

            } else if (schoolConstruction == 1) {
                System.out.println("$121");    


            }
        }
    }
}




            
        

