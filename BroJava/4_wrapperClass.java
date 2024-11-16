package BroJava;

class wrapperClass {
  public static void main(String[] args) {
    // wrapper class - provides a way to use primitive data types as a reference
    // data types
    // reference data types contains useful methods
    // can be used with collections (ArrayList)

    // Primitive Wrapper
    // boolean Boolean
    // char Character
    // int Integer
    // double Double

    // autoBoxing - the automatic conversion that the Java compiler makes between
    // the primitive
    // types and their corresponding object wrapper classes

    // unBoxing - the reverse of autoBoxing. Automatically converting an object of a
    // wrapper class
    // to its corresponding primitive type

    // autoBoxing
    Boolean booleanValue = true;
    Character charValue = 'a';
    Integer intValue = 10;
    Double doubleValue = 10.5;
    String stringValue = "Ashwath";

    // here the primitive type is compared with the Boolean reference type via the
    // autoBoxing process
    // the autoBoxing process converts the primitive type to the Boolean reference
    // type

    // since reference data types contains useful methods
    // variable.{list of methods}

    System.out.println("int's floatvalue method : " + intValue.floatValue());

    // unBoxing
    int unBoxedIntValue = intValue;
    System.out.println("unBoxedIntValue : " + unBoxedIntValue);

    if (booleanValue == true) {
      System.out.println("booleanValue is true");
    }

    // here the Boolean reference type is compared with the primitive type via the
    // unBoxing process
    // the unBoxing process converts the Boolean reference type to the primitive
    // type

  }
}
