package sections;

import sections.section3.BarkingDog;
import sections.section3.LeapYear;
import sections.section3.MegaBytesConverter;

public class Main {

    public static void main(String args[]) {

        /* section 3 */
        // Exercise 3
        System.out.println("Exercise 3 started");
        MegaBytesConverter megaBytesConverter = new MegaBytesConverter();
        megaBytesConverter.printMegaBytesAndKiloBytes(-2500);
        System.out.println("Exercise 3 ended");
        //Exercise 4
        System.out.println("Exercise 4 started");
        BarkingDog barkingDog = new BarkingDog();
        System.out.println(barkingDog.shouldWake(false,22));
        System.out.println(barkingDog.shouldWake(true, 4));
        System.out.println(barkingDog.shouldWake(true, 24));
        System.out.println("Exercise 4 ended");
        //Exercise 5
        System.out.println("Exercise 5 started");
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(2023));
        System.out.println(leapYear.isLeapYear(2020));
        System.out.println(leapYear.isLeapYear(2000));
        System.out.println(leapYear.isLeapYear(1211));
        System.out.println(leapYear.isLeapYear(10000));
        System.out.println("Exercise 5 ended");
    }
}
