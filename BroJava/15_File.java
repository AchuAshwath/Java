package BroJava;
import java.io.*;

class Javafile {
    public static void main(String[] args) {
        File myFile = new File("BroJava");
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

        // FileWriter
        try{
            FileWriter writer = new FileWriter("BroJava/15_file.txt");
            writer.write("Roses are red\nViolets are blue\n34 +35 is math\nif you know what to do");
            writer.append("\n\t\t\t- Ashwath");
            writer.close();
        }catch(IOException e){  
            e.printStackTrace();
        }

        // FileReader - read the contents of a file as a stream of characters, read() returns int value which contains the byte value
        //              when read() -1 there is no more data to be read
        try{
            FileReader reader = new FileReader("BroJava/15_file.txt");
            System.out.println(reader);
            int data = 0;
            while(data != -1){
                data = reader.read();
                System.out.print((char)data);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();    
        }
    }    
}
