package BroJava.Package2;
import BroJava.Package1.*;

public class subclass1 extends class1 {
    public static void main(String[] args) {
        class3 obj = new class3();
        System.err.println(obj.publicModifier);
        System.out.println(obj.defaultModifier);

        subclass1 obj2 = new subclass1();
        System.out.println(obj2.protectedModifier); // subclass1 can access protectedModifier from class1 because subclass1 is a subclass of class1
        //The field class3.defaultModifier is not visibleJava(33554503)
        // subclass1 can access defaultModifier from class3 because they are in the same package
    }
    
    
}
