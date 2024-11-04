class dataTypes {
    public static void main(String[] args) {
        // Primitive data types

        // integer types
        byte aSingleByte = 100;     // -128 to 127
        short aSmallNumber = 23589; // -32768 to 32,767
        int anInteger = 217483069;  // -2147483648 to 2147483647
        long aLargeNumber = 4223372036854775808L; // -9223372036854775808 to 9223372036854775807
        // can denote long number with L or l at the end

        //decimal types
        double aDouble = 1.696969; // 4.9E-324 to 1.7976931348623157E388 double prescision 64bit
        float aFloat = 3.4208F;    // 1.4E-45 to 3.4028235E38 - can denote float with small 
        // by default the complier will assume any value with decimal places as double to let the complier know append F 

        // boolean types
        boolean aTruevalue = true;
        boolean aFalseValue = false;

        // character types
        char copyrightSymbol = '\u00A9'; // can hold and unicode value
        char percentSymbol = '%';
        System.out.println("Copyright symbol : "+copyrightSymbol);
        System.out.println("Percentage symbol : "+percentSymbol);


        //Implicit Type conversion

        int intNumber = 5;
        double doubleNumber = intNumber;

        System.out.println("Implicit type conversion of intNumber : "+doubleNumber);

        // double doubleNumber = 6.9;
        // int IntNumber = doubleNumber;
        
        // System.out.println(IntNumber);

        // Type mismatch: cannot convert from double to int

        // Explicit type conversion

        double aDoubleNumber = 6.9;
        int expicitIntNUmber = (int)aDoubleNumber; // (typecast :) data may be lost 

        System.out.println("Explicit type conversion of a doubleNumber : "+expicitIntNUmber);

    }    
}
