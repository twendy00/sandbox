import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

    // revisit
    public int calcAge(LocalDate dob) {
        // NOT SURE IF I SHOULD LOOK AT ONLY YEAR OR BOTH MONTH AND YEAR
        LocalDate today = LocalDate.now();

        Period p = Period.between(dob, today);

        int months = p.getMonths();
        int age = p.getYears();

        return age;
    }

    public int calcRetireYears(int age) {
        int retirementAge = 65;
        int yearsToRetire = 0;

        yearsToRetire = retirementAge - age;

        return yearsToRetire;
    }

}
