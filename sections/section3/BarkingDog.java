package sections.section3;

public class BarkingDog {
    public boolean shouldWake(boolean barking, int hourOfDay ) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23) return false;
        boolean wakeUp = false;
        if(hourOfDay > 22 || hourOfDay < 8) {
            wakeUp = true;
        }
        return wakeUp;
    }
}
