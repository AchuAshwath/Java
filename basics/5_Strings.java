class strings{
    public static void main(String[] args){
        String  literalString1 = "string"; // normal literal string
        String  literalString2 = "string";

        String objectString1 = new String("string"); // new keyword is used to initiate a new object 
        String objectString2 = new String("string");
        
        System.out.println(literalString1 == literalString2);
        System.err.println(objectString1 == objectString2);

        // String format
        
        String name = "ashwath"; // %s
        int age = 21; // %d
        double attendance = 88.8; // %f
        char percentSymbol = '%'; // %c
        boolean truth = false;

        System.out.println("hi my name is "+name+ " and my age is "+ age +" i have a attendance of "+ attendance+""+percentSymbol+" and all my claims are "+ truth);
        // normal way

        // string format way
        String formatedString = String.format("hi my name is %s and my age is %d i have a attendance of %f%c and all my claims are %b", name, age, attendance, percentSymbol ,truth);
        System.out.println(formatedString);
        // System.out.println(String.format("hi my name is %s and my age is %d i have a attendance of %f%c and all my claims are %b", name, age, attendance, percentSymbol ,truth));
        
    }
}