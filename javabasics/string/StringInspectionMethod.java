package javabasics.string;

public class StringInspectionMethod {
    public void runAllInspectionMethods(String value) {
        int length = value.length();
        char index = '.';
        if(length != 0 )
        index = value.charAt(2);
        int lastIndexOfValue = value.lastIndexOf("ryan");
        boolean isEmptyString = value.isEmpty();
        boolean isBlankString = value.isBlank();
        System.out.printf("length = %d, index = %c, lastIndexOfValue = %d, isEmptyString = %b, isBlank = %b\n",length,index
        ,lastIndexOfValue,isEmptyString,isBlankString);
    }
}
