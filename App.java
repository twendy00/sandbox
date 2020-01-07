import java.time.LocalDate;

public class App {
    public static void main (String[] args) {

        WorthItIntro wii = new WorthItIntro();
        CalculateAge ca = new CalculateAge();
        Calculations c = new Calculations();

        //PUT IN SOME TYPE OF SIGNUP/LOGIN LOGIC

        String name = "";
        LocalDate dob;
        String incomeType = "";
        double income = 0;
        double weeklyHours = 0;
        double hourlyIncome = 0;
        int age = 0;
        int yearsToRetire = 0;
        double price = 0;
        double timeCost = 0;
        double savingsCostRetire = 0;
        double invest4PercentCost = 0;
        double invest6PercentCost = 0;

        name = wii.getName();
        dob = wii.getDOB();
        income = wii.getIncome();
        incomeType = wii.getIncomeType();
        weeklyHours = wii.getWeeklyHours();
        hourlyIncome = wii.getHourlyIncome(income, weeklyHours);
        age = ca.calcAge(dob);
        yearsToRetire = ca.calcRetireYears(age);
        price = c.getPrice();
        timeCost = c.calcTime(price, hourlyIncome);
        savingsCostRetire = c.calcSavingsRetirement(price, yearsToRetire);
        invest4PercentCost = c.calc4PercentInvest(price, yearsToRetire);
        invest6PercentCost = c.calc6PercentInvest(price, yearsToRetire);

        System.out.println("Welcome back, " + name + "!");

        System.out.println("It costs " + timeCost + " hours of your time to purchase this product.");
        System.out.println("If you put this money in savings, it will grow to " + savingsCostRetire + " by the time you retire.");
        System.out.println("If you invested this money, it will grow to " + invest4PercentCost + " by the time you retire assuming a 4% return.");
        System.out.println("If you invested this money, it will grow to " + invest6PercentCost + " by the time you retire assuming a 6% return.");

    }
}