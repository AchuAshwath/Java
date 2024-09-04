package BroJava;

class JavaMethods {
    public static void main(String[] args) {
        // method is a set of instruction/ block of code - {}, that is executed when it it called.
        helloWorld();

        // cannot make a static reference to a non static method from the type JavaMethods

    }

    static void helloWorld(){
        System.out.println("Hello, World!");
    }
}
