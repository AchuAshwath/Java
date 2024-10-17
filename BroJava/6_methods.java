package BroJava;

class JavaMethods {
    public static void main(String[] args) {
        // method is a set of instruction/ block of code - {}, that is executed when it is called.
        helloWorld();
        StringhelloWorld("Ashwath");
        System.out.println("calculating sum of 1 and 3 using the sum function : "+sum(1,3));
        System.out.println("Overloaded function of sum in double data type : "+sum(0.69, 0.69));
        System.out.println("sum of three numbers 1,2,3 : "+sum(1, 2, 3 ));

        // cannot make a static reference to a non static method from the type JavaMethods

    }

    static void helloWorld(){
        System.out.println("Hello, World!");
    }

    static void StringhelloWorld(String Name){
        System.out.println("Hello, "+ Name+ "!");
    }

    static int sum(int number1, int number2){
        return number1+ number2;
    }
    // overloaded functions = methods that share the same name but have different parameters
    //                        method name + parameters = method signature

    static double sum(double number1, double number2){
        return number1 + number2;
    }

    static int sum(int number1, int number2, int number3){
        return number1+number2+number3;
    }
}

