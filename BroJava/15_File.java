package BroJava;
import java.io.*;

class Javafile {
    public static void main(String[] args) {
        File myFile = new File("C:\\courses\\java\\BroJava");
        File unknownFile = new File("unknown.file");

        if(myFile.exists()){
            System.out.println();
            System.out.println(myFile.toString()+" exists");
            System.out.println(myFile.getName());
            System.out.println(myFile.getAbsoluteFile());
            System.out.println(myFile.isFile());
            System.out.println(myFile.isDirectory());
            System.out.println(myFile.isAbsolute());
        }
        System.out.println(unknownFile.isDirectory());
        System.out.println(unknownFile.isFile());
        System.out.println(unknownFile.isAbsolute());
    }    
}
