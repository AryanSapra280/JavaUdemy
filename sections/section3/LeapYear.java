package sections.section3;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if( year < 1 || year > 9999)
            return  false;
        boolean leapYear = true;
        int remOfFour = year%4;
        if(remOfFour == 0 ){
            int remOfHund = year%100;
            if(remOfHund == 0) {
                int remOfFourHund = year%400;
                if(remOfFourHund != 0) {
                    leapYear = false;
                }
            }
        }
        else {
            leapYear = false;
        }
        return leapYear;
    }
}
