import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculations {
    // Gets price for product that user wants to buy
    public double getPrice() {
        Scanner scan = new Scanner (System.in);

        double price = 0;
        String product = "";

        System.out.println("What do you want to buy?");
        product = scan.nextLine();
        System.out.println("How much does it cost?");
        price = scan.nextInt();

        return price;
    }

    // Calculates the working time it takes to buy that product
    public double calcTime(double price, double hourlyIncome) {
        double timeCost = price/hourlyIncome;

        return timeCost;
    }

    public double calcSavingsRetirement(double price, int yearsToRetire) {
        double savingsRate = 0.0170;
        double savingsCostRetire = price;

        for (int i = 0; i < yearsToRetire; i++){
            savingsCostRetire = savingsCostRetire + (savingsCostRetire*savingsRate);
        }; 

        return savingsCostRetire;
    }

    public double calc4PercentInvest(double price, int yearsToRetire) {
        double invest4PercentRate = 0.04;
        double invest4PercentCost = price;
        
        for (int i = 0; i < yearsToRetire; i++){
            invest4PercentCost = invest4PercentCost + (invest4PercentCost*invest4PercentRate);
        }; 

        return invest4PercentCost;
    }

    public double calc6PercentInvest(double price, int yearsToRetire) {
        double invest6PercentRate = 0.06;
        double invest6PercentCost = price;
        
        for (int i = 0; i < yearsToRetire; i++){
            invest6PercentCost = invest6PercentCost + (invest6PercentCost*invest6PercentRate);
        }; 

        return invest6PercentCost;
    }

}