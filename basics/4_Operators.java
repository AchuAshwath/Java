class Operators{
    public static void main(String[] args) {
        int NumberOne = 6;
        int NumberTwo = 9;

        // Arthimetic operators

        // addition operator
        System.out.println(NumberOne + NumberTwo);

        // subtraction operator
        System.out.println(NumberOne - NumberTwo);

        // Multiplication operator
        System.out.println(NumberOne * NumberTwo);

        // Remainder/ Modulo operator
        System.out.println(NumberTwo % NumberOne);

        // Division Operator
        System.out.println(NumberTwo / NumberOne);

        // division by int returns int
        // division by int or (double or float) will return decimal output

        // = -> assingment operator
        // -=, +=, *=, /=, %=

        // Bitwise Operators

        // equal to operator
        System.out.println(NumberOne == NumberTwo);

        // not equal to operator
        System.out.println(NumberOne != NumberTwo);

        // less than operator
        System.out.println(NumberOne < NumberTwo);

        // less than or equal to operator
        System.out.println(NumberOne <= NumberTwo);

        // greater than operator
        System.out.println(NumberOne > NumberTwo);

        // greater than equal to operator
        System.out.println(NumberOne >= NumberTwo);

        // Conditional Operators

        // and operator
        System.out.println(NumberOne >= NumberTwo && NumberOne > NumberTwo);

        // or operator
        System.out.println(NumberOne >= NumberTwo || NumberOne > NumberTwo);
         
        // unary operators

        // not operator
        System.out.println(!(NumberOne >= NumberTwo || NumberOne > NumberTwo)); //  takes only one argument - unary operators
        
        // increamental operator
        NumberOne++;

        // decremental opertor
        NumberTwo--;

        System.out.println(NumberOne);
        System.out.println(NumberTwo);

        // pre increament/decrement
        System.out.println(++NumberOne);
        System.out.println(--NumberTwo);

        // post increament/ decrement
        System.out.println(NumberOne++);
        System.out.println(NumberTwo--);

        System.out.println(NumberOne);
        System.out.println(NumberTwo);

    }
    
}
