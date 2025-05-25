package sections.section3;

public class AreaCalculator {
    private final static double PI = 22.0/7.0;

    public static double area(double radius) {
        if(radius<0) {
            return -1.0;
        }
        double area = PI*radius*radius;
        return area;
    }
    public static double area(double length, double breadth) {
        if(length<0 || breadth<0) {
            return -1.0;
        }
        return length*breadth;
    }
}
