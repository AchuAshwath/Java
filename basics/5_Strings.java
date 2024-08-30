class strings{
    public static void main(String[] args){
        String  literalString1 = "string"; // normal literal string
        String  literalString2 = "string";

        String objectString1 = new String("string"); // new keyword is used to initiate a new object 
        String objectString2 = new String("string");
        
        System.out.println(literalString1 == literalString2);
        System.err.println(objectString1 == objectString2);

        // String format

        String name = "Ashwath"; // %s
        int age = 21; // %d
        double attendance = 88.8; // %f
        char percentSymbol = '%'; // %c
        boolean truth = false;  //%b

        System.out.println("hi my name is "+name+ " and my age is "+ age +" i have a attendance of "+ attendance+""+percentSymbol+" and all my claims are "+ truth);
        // normal way

        // string format way
        String formattedString = String.format("hi my name is %s and my age is %d i have a attendance of %f%c and all my claims are %b", name, age, attendance, percentSymbol ,truth);
        System.out.println(formattedString);
        // System.out.println(String.format("hi my name is %s and my age is %d i have a attendance of %f%c and all my claims are %b", name, age, attendance, percentSymbol ,truth));
        
        // string methods

        String empty = "";

        System.out.println("lenght of the name : "+name.length());
        System.out.println("name in uppercase : "+name.toUpperCase());
        System.out.println("name in lowercase : "+name.toLowerCase());
        System.out.println("is the empty string variable really empty? \n"+empty.isEmpty());
        System.out.println("is the name variable really empty? \n"+name.isEmpty());

        // comparing two object strings
        System.out.println("comparing two Object strings : "+objectString1.equals(objectString2));  // use .equalsIgnoreCase() to ignore case sensitivity

        // replace in strings
        System.out.println("replacing hi from the formattedString variable with Hi \n"+formattedString.replace("hi", "Hi"));
        System.out.println("checking if the formattedString contains the word attendance \n"+formattedString.contains("attendance"));

    }
}