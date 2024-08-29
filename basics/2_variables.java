class variables{
    // {} - code block
    // variables you declare within a code block will be availabe only within that code block - local variables
    // if you declare a variable here the variable will be availabe throughout the whole class
    static String hello = "Hello world!";  
    static int $count;  //can name you variable starting with $ and _
    public static void main(String[] args){
        int age;    //declaration 
        age = 21;   // Initializaiton  
        String place = "coimbatore";    // declaration and initilatisation
        // int age;  you can't declare a variable twice
        //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        //Duplicate local variable age
        // you can name same variables out side a code block, because the variable is local to that method
        
        System.out.println(hello+$count);  
        // static variables will only work with static methods 
        // count will not give error, because the complier will assign a default value to it, numbers is 0
        System.out.println("This is my age : "+ age + "because I was born in "+ place);  // cannot use uninitialised variables

    }
}
