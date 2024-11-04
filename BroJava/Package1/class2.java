package BroJava.Package1;
import BroJava.Package2.*;

public class class2 {
    private String privateModifier = "private";
    

    public static void main(String[] args) {
        class2 obj = new class2();
        System.out.println(obj.privateModifier);
    }
}


// modifier     // class      // package      // subclass      // world
// public       // yes        // yes          // yes           // yes       
// protected    // yes        // yes          // yes           // no
// default      // yes        // yes          // no            // no
// private      // yes        // no           // no            // no