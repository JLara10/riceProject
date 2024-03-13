package project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello what product would you like?");
        String product = scan.nextLine();

        System.out.println("Enter the price per unit?");
        double answer = scan.nextDouble();

        System.out.println("How many bags would you like?");
        int amount = scan.nextInt();

        System.out.println("What is the distance in miles you need it delivered too?");
        double miles = scan.nextDouble();

        double deliveryFee;
        
        if(miles<= 4 && miles >= 0) {
            deliveryFee = 2.0;
        } else if (miles <= 15 && miles >= 5) {
            deliveryFee = 5.0;
        } else if (miles <= 25 && miles >= 16) {
            deliveryFee = 10.0;
        } else if (miles <= 50 && miles >= 26) {
            deliveryFee = 15.0;
        } else {
            deliveryFee = 20.0;
        }

        System.out.println("You purchased " + product);
        double totalCost = (amount * answer) + deliveryFee;
        System.out.println("Total cost: $" + totalCost);

        scan.close();




    }
        }



