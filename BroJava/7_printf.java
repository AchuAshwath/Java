package BroJava;

class printFormat{
    public static void main(String[] args){
        // printf() = an optional method to control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]
        //            % = indicates a variable
        //            flags = adds an effect to output (+, -, 0, ', etc.)
        //            precision = number of decimal places
        //            width = number of characters to display
        //            [conversion-character] = d = decimal integer [byte, short, int, long]
        //                                    f = floating point number [float, double]
        //                                    c = character
        //                                    s = string
        //                                    h = hashcode
        //                                    t = date/time
        //                                    % = output a % sign

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Ashwath";
        int myInt = 50;
        double myDouble = 1000;

        // final keyword = constant, value cannot be modified
        final double PI = 3.14159;

        // PI = 3.14;  error: cannot assign a value to final variable PI

        // [conversion-character]
        System.out.printf("%b\n", myBoolean); // %b = boolean
        System.out.printf("%c\n", myChar); // %c = char
        System.out.printf("%s\n", myString); // %s = string
        System.out.printf("%d\n", myInt); // %d = int
        System.out.printf("%f\n", myDouble); // %f = double

        // [width]
        System.out.printf("Hello %20s!\n", myString); // %10s = 10 characters wide
        System.out.printf("Hello %-10s !\n", myString); // %-10s = 10 characters wide, left-justified

        // [precision]
        System.out.printf("You have this much money %.2f\n", myDouble); // %.2f = 2 decimal places

        // [flags]
        System.out.printf("You have this much money %,f\n", myDouble); // %,f = use , to group numbers
        System.out.printf("You have this much money %,.2f\n", myDouble); // %,.2f = use , to group numbers, 2 decimal places

        // [argument-index$]
        // System.out.printf("\n", "beers", "99"); // 1$ = first argument, 2$ = second argument

        // [flags] = adds an effect to output
        // - = left-justify
        // + = output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 = numeric values are zero-padded
        // , = comma grouping separator if numbers > 1000
        // ( = encloses negative numbers in parentheses
        // # = add 0, 0x, 0X, 0b, 0B prefixes
        // space = leave a space for positive numbers
        System.out.printf("%,d\n", 1000000000);
        System.out.printf("%(d\n", -1000000000);
        System.out.printf("%+,d\n", 1000000000);
        System.out.printf("%+,d\n", -1000000000);
        System.out.printf("%010d\n", 1000);
        System.out.printf("%,010d\n", 1000);
        System.out.printf("%,010d\n", 1000000000);


    }
}