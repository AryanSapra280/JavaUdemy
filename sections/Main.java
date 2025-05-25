package sections;

import sections.section3.BarkingDog;
import sections.section3.MegaBytesConverter;

public class Main {

    public static void main(String args[]) {

        /* section 3 */
        // Exercise 3
        MegaBytesConverter megaBytesConverter = new MegaBytesConverter();
        megaBytesConverter.printMegaBytesAndKiloBytes(-2500);
        //Exercise 4
        BarkingDog barkingDog = new BarkingDog();
        System.out.println(barkingDog.shouldWake(false,22));
        System.out.println(barkingDog.shouldWake(true, 4));
        System.out.println(barkingDog.shouldWake(true, 24));
    }
}
