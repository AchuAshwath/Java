package BroJava.Package1;
import BroJava.Package2.*;  // since we import class3 from package2, we can access it in class1 
                            // if we remove public from class3 we will not be able to access it in class1 even tho we import it
                            // The type class3 is not visibleJava(16777219
public class class1 {
    protected String protectedModifier = "protected";
    public static void main(String[] args) {
        class3 obj = new class3();
        System.out.println(obj.publicModifier);
        // System.out.println(obj.defaultModifier);
        //The field class3.defaultModifier is not visibleJava(33554503)
        // class1 cannot access defaultModifier from class3 because they are in different packages

        class2 obj2 = new class2();
        //System.out.println(obj2.privateModifier);  class 1 cannot access privateModifier from class2 because it is private
                                                  // only class2 can access privateModifier  
    }
    
}
