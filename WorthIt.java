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
}