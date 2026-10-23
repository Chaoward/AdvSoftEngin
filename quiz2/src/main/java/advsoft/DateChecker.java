package advsoft;

import java.time.Month;

public class DateChecker {
    private static Month[] months31Days = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public Boolean has31Days(Month month) {
        for (Month m : months31Days) {
            if (month == m)
                return true;
        }

        return false;
    }
}
