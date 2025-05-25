package sections.section3;

public class DecimalComparator {
    public boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        int factor = (int)Math.pow(10,3);
        long val1 = 0L;
        long val2 = 0L;
        if(value1<0) {
            val1 = (long)Math.ceil(value1*factor);
            val2 = (long)Math.ceil(value2*factor);
        }
        else {
            val1 = (long)Math.floor(value1*factor);
            val2 = (long)Math.floor(value2*factor);
        }

        if(val1 == val2) {
            return true;
        }
        return false;
    }
}
