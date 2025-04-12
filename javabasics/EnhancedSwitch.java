package javabasics;

public class EnhancedSwitch {
    private String valueFromSwitch(int val) {
        String switchVal =  switch (val){
            case 1 -> {int a = 10;

                yield  "I am one";}
            case 2-> {yield "I am two";}
            default -> {yield "no value";}
        };
        return switchVal;
    }
    public static void main(String args[]) {
        int val  = 1;
        EnhancedSwitch obj = new EnhancedSwitch();
        System.out.println(obj.valueFromSwitch(val));
    }
}
