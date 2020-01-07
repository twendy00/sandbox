public class App {
    public static void main (String[] args) {

        WorthItIntro wii = new WorthItIntro();
        CalculateAge ca = new CalculateAge();
        Calculations c = new Calculations();

        //PUT IN SOME TYPE OF SIGNUP/LOGIN LOGIC

        String name = "";
        float timeCost = 0;
        float savingsCostRetire = 0;
        float invest4PercentCost = 0;
        float invest6PercentCost = 0;

        name = wii.getName();
        timeCost = c.calcTime();
        savingsCostRetire = c.calcSavingsRetirement();
        invest4PercentCost = c.calc4PercentInvest();
        invest6PercentCost = c.calc6PercentInvest();

        System.out.println("Welcome back, " + name + "!");

        System.out.println("It costs " + timeCost + " hours of your time to purchase this product.");
        System.out.println("If you put this money in savings, it will grow to " + savingsCostRetire + " by the time you retire.");
        System.out.println("If you invested this money, it will grow to " + invest4PercentCost + " by the time you retire assuming a 4% return.");
        System.out.println("If you invested this money, it will grow to " + invest6PercentCost + " by the time you retire assuming a 6% return.");

    }
}