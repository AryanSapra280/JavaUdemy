package sections;

import sections.section3.*;

import java.awt.geom.Area;

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

        System.out.println("Exercise 6 started");
        DecimalComparator decimalComparator = new DecimalComparator();
        System.out.println(decimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(decimalComparator.areEqualByThreeDecimalPlaces(-3.1757,-3.175));
        System.out.println(decimalComparator.areEqualByThreeDecimalPlaces(3.175,3.175));
        System.out.println("Exercise 6 ended");

        System.out.println("Exercise 9 started");
        System.out.println("Circle area = " + AreaCalculator.area(20.75));
        System.out.println("Rectangle area = " + AreaCalculator.area(4.0,2.0));
        System.out.println("Exercise 9 ended");
    }
}
