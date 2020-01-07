import java.time.LocalDate;

public class CalculateAge {

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

}
