import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class WorthIt{

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int dob = 0;
        String username = "";
        String name = "";
        boolean salary = false;
        boolean wage = false;
        int income = 0;
        int weeklyHours = 0;
        int price = 0;
        String product = "";
        int hourlyIncome = 0;
        int age = 0;
        int yearsToRetire = 0;

    // Initial form to get basic information from user
    // Not sure if I should add login component and if so, how to do it. 
    System.out.println("Thanks for signing up for Worth It!");
    System.out.println("To get started, let me ask you a few questions.");

    System.out.println("What is your first name?");
    name = scan.nextLine();
    System.out.println("Thanks " + name + "!");
    System.out.println("What is your date of birth?");
    // NEED TO FORMAT DOB SOMEHOW
    dob = scan.nextInt();
    System.out.println("Great! At your job, are you a salaried or hourly employee?");
    // NEED TO PUT SOMETHING HERE WITH THE SALARY/WAGE LOGIC
    System.out.println("Alright. And how much do you earn?");
    income = scan.nextInt();
    System.out.println("And how many hours do you typically work in a week?");
    weeklyHours = scan.nextInt();
    System.out.println("Great! Thanks for that information. You are all set.");

    }

    public int calcAge() {
        // NOT SURE IF I SHOULD LOOK AT ONLY YEAR OR BOTH MONTH AND YEAR
        LocalDate today = LocalDate.now();

        Period p = Period.between(dob, today);

        int months = period.getMonths();
        int years = period.getYears();

        return years;
    }

    public int calcRetireYears() {
        int retirementAge = 65;

        yearsToRetire = retirementAge - age;

        return yearsToRetire;
    }

    public double getHourlyIncome() {
        float hourlyIncome = income/weeklyHours;
        return hourlyIncome;
    }

    // Gets price for product that user wants to buy
    public int getPrice() {
        Scanner scan = new Scanner (System.in);

        int price = 0;
        String product = "";

        System.out.println("What do you want to buy?");
        product = scan.nextLine();
        System.out.println("How much does it cost?");
        price = scan.nextInt();

        return price;
    }

    // Calculates the working time it takes to buy that product
    public float calcTime() {
        float timeCost = price/hourlyIncome;

        return timeCost;
    }

    public float calcSavingsRetirement() {
        float savingsRate = 0.0170;
        float savingsCostRetire = price;
        float yearsToRetire = 65 - age;

        for (int i = 0; i < yearsToRetire; i++){
            savingsCostRetire = savingsCostRetire + (savingsCostRetire*savingsRate);
        }; 

        return savingsCostRetire;
    }

    public float calc4PercentInvest() {
        float invest4PercentRate = 0.04;
        float invest4PercentCost = price;
        
        for (int i = 0; i < yearsToRetire; i++){
            invest4PercentCost = invest4PercentCost + (invest4PercentCost*invest4PercentRate);
        }; 

        return invest4PercentCost;
    }

        public float calc6PercentInvest() {
        float invest6PercentRate = 0.06;
        float invest6PercentCost = price;
        
        for (int i = 0; i < yearsToRetire; i++){
            invest6PercentCost = invest6PercentCost + (invest6PercentCost*invest6PercentRate);
        }; 

        return invest6PercentCost;
    }


}