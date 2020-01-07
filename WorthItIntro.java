import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class WorthItIntro{

        Scanner scan = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");

    // Initial form to get basic information from user
    // Not sure if I should add login component and if so, how to do it. 
    public static void signupIntro() {
        System.out.println("Thanks for signing up for Worth It!");
        System.out.println("To get started, let me ask you a few questions.");
    }

    public String getName() {
        Scanner scan = new Scanner (System.in);
        String name = "";

        System.out.println("What is your first name?");
        name = scan.nextLine();
        System.out.println("Thanks " + name + "!");

        return name;
    }

    // revisit
    public class getDOB() {
        Scanner scan = new Scanner (System.in);
        LocalDate dob;

        System.out.println("What is your date of birth?");
        // NEED TO FORMAT DOB SOMEHOW
        dob = scan.nextDate();
        // new SimpleDateFormat(dateFormat).parse(scanner.nextLine()))

        return dob;
    }

    // revisit
    public string getIncomeType() {
        Scanner scan = new Scanner (System.in);
        String incomeType = "wage";

        System.out.println("At your job, are you a salaried or hourly employee?");
        // NEED TO PUT SOMETHING HERE WITH THE SALARY/WAGE BOOLEAN LOGIC
        incomeType = scan.nextLine();

        return incomeType;
    }

    public double getIncome() {
        Scanner scan = new Scanner (System.in);
        double income = 0;

        System.out.println("And what is your income?");
        income = scan.nextInt();

        return income;
    }

    public double getWeeklyHours() {
        Scanner scan = new Scanner (System.in);
        double weeklyHours = 0;

        System.out.println("And how many hours do you typically work in a week?");
        weeklyHours = scan.nextInt();

        return weeklyHours;
    }

    public double getHourlyIncome(double income, double weeklyHours) {
        float hourlyIncome = income/weeklyHours;
        
        return hourlyIncome;
    }

    public static void signupClosing() {
        System.out.println("Great! Thanks for that information. You are all set.");
    }

}

// WANT TO KEEP THESE 2 SECTIONS AND CONTINUALLY UPDATE
    public int calcAge(LocalDate dob) {
        // NOT SURE IF I SHOULD LOOK AT ONLY YEAR OR BOTH MONTH AND YEAR
        LocalDate today = LocalDate.now();

        Period p = Period.between(dob, today);

        int months = period.getMonths();
        int years = period.getYears();

        return years;
    }

    public int calcRetireYears(int years) {
        int retirementAge = 65;

        yearsToRetire = retirementAge - age;

        return yearsToRetire;
    }

