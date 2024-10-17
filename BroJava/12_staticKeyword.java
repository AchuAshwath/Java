package BroJava;
class Friends{
    String name;
    static int numberOfFriends;

    Friends(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        // System.out.println(name);
        // Cannot make a static reference to the non-static field name
        System.out.println("you have "+numberOfFriends + " friends");
    }
}
class staticKeyword{
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //           The class "owns" the static member
        //           can be accessed directly by the class name
        //           A static method can access only other static members
        //           A static method cannot refer to "this" or "super" in any way
        
        // static variables
        Friends friend1 = new Friends("Ashwath");
        Friends friend2 = new Friends("Malini");
        Friends friend3 = new Friends("Anush");

        System.out.println("usually we can access members of object of \nfriend1 : "+friend1.name);

        //System.out.println(Friends.name);
        // Cannot make a static reference to the non-static field Friends.nameJava(33554506)

        System.out.println("statically we can call for the number of friends wihtout referencing the object just by calling the class name "+Friends.numberOfFriends);

        Friends.displayFriends();

    }
    
}


