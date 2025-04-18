package javabasics;

public class StaticVariableUsage {
    public static int count = 10;
    public static void main(String args[]) {
        StaticVariableUsage staticVariableUsage = new StaticVariableUsage();
        StaticVariableUsage staticVariableUsage2 = new StaticVariableUsage();
        staticVariableUsage2.count++;
        System.out.println("accessed by object reference = " + staticVariableUsage.count);
        System.out.println("accessed by Class Name = " + StaticVariableUsage.count);
    }
}
