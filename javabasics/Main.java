package javabasics;

import javabasics.string.StringInspectionMethod;

public class Main {
    public static void main(String args[]) {
        StringInspectionMethod stringInspectionMethod = new StringInspectionMethod();
        stringInspectionMethod.runAllInspectionMethods("Aryan");
        stringInspectionMethod.runAllInspectionMethods("");
        stringInspectionMethod.runAllInspectionMethods("    ");
    }
}
