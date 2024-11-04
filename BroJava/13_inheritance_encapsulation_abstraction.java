package BroJava;
import java.util.Scanner;

class inheritance{
    public static void main(String[] args) {
        // vehicle myVehicle = new vehicle("Ford", "Mustang", 1969);
        // Cannot instantiate the type vehicleJava(16777373)

        Bike myBike = new Bike("Ford ", "Mustang ", 1969, "Mustang ");
        myBike.start();
        myBike.honk();

        sportsCar mySportsCar = new sportsCar(null, null, 0, "Lamborghini ");   
        mySportsCar.stop();
        mySportsCar.start();
        
        // System.out.println(myBike.name);
        //The field Bike.name is not visibleJava(33554503)
        // System.out.println(mySportsCar.name);
        // The field sportsCar.name is not visibleJava(33554503)
        
        System.out.println(mySportsCar.toString());
        System.out.println(myBike.toString());
        // Encapsulation - attributes of a class will be hidden or private, 
        //                 and can be accessed only through methods (getters and setters)
        //                 You should make attributes private, if you don't want to allow the code outside the class to access it

        System.out.println("Bike@"+System.identityHashCode(myBike));    // since toString() is overridden, we use identityHashCode
        System.out.println("sportsCar@"+System.identityHashCode(mySportsCar));

        // so we use getters and setters to access the private attributes
        System.out.print(myBike.getBrand());
        System.out.print(myBike.getModel());
        System.out.print(myBike.getName());
        System.out.print(myBike.getYear());
        
        // setting the values of the private attributes

        // mySportsCar.name = "SVJ";
        //he field sportsCar.name is not visibleJava(33554503)
        mySportsCar.brand = "Lamborghini ";
        mySportsCar.model = "Aventador ";
        mySportsCar.year = 2018;
        mySportsCar.setName("SVJ ");

        System.out.print(mySportsCar.getBrand());
        System.out.print(mySportsCar.getModel());
        System.out.print(mySportsCar.getName());
        System.out.print(mySportsCar.getYear());
        
        // Copying the values of one object to another
        Bike copyBike = new Bike(null, null, 0, null);
        System.out.println("before copying");
        System.out.print(copyBike.getBrand());
        System.out.print(copyBike.getModel());
        System.out.print(copyBike.getName());
        System.out.print(copyBike.getYear());
        copyBike.copy(myBike);
        System.out.print("after copying");
        System.out.print(copyBike.getBrand());
        System.out.print(copyBike.getModel());
        System.out.print(copyBike.getName());
        System.out.print(copyBike.getYear());

        // copy constructor
        sportsCar copySportsCar = new sportsCar(mySportsCar);
        System.out.println();
        System.out.print(copySportsCar.getBrand());
        System.out.print(copySportsCar.getModel());
        System.out.print(copySportsCar.getName());
        System.out.print(copySportsCar.getYear());

        // polymorphism - ablitity of an object to identify as more than one type
        vehicle[] myGarage = {myBike, mySportsCar, copyBike, copySportsCar};
        System.out.println();
        System.out.println("vehicles in my garage");
        for(vehicle VehicleFromGarage: myGarage){
            System.out.println(VehicleFromGarage.toString());
            VehicleFromGarage.start();
        }

        // dynamic polymorphism - runtime polymorphism
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vehicle to start \n 1. Bike \n 2. sportsCar");
        int choice = scanner.nextInt();
        if(choice == 1){
            Bike dynamicBike = new Bike("Yamaha ", "R15 ", 2022, "M version ");
            dynamicBike.start();
            System.out.println(dynamicBike.toString());
        }
        else if (choice == 2){
            sportsCar dynamicSportsCar = new sportsCar("Ferrari ", "F8 ", 2022, "Spider ");
            dynamicSportsCar.start();
            System.out.println(dynamicSportsCar.toString());
        }
        else{
            System.out.println("Invalid choice");
        }
        scanner.close();

    }    
}

abstract class vehicle{        // abstract class cannot be instantiated
    String brand;
    String model;
    int year;
    vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    abstract void start();         // abstract methods are declared without an implementation
    void honk(){
        System.out.println("Tuut, tuut!");
    }
    void stop(){
        System.out.println("Screech!");
    }
    public String toString(){
        return this.brand+" "+this.model+" "+this.year+" ";
    }
}

class Bike extends vehicle{
    private String name;
    Bike(String brand, String model, int year, String name){
        super(brand, model, year);
        this.name = name;
    }

    // method overriding
    @Override
    void start(){
        System.out.println("sdhk...Vroom Vroom");
    }
    @Override
    public String toString(){
        return super.toString()+this.name;
    }
    String getBrand(){
        return this.brand;
    }
    String getModel(){
        return this.model;
    }
    int getYear(){
        return this.year;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    void copy(Bike bike){
        this.brand = bike.brand;
        this.model = bike.model;
        this.year = bike.year;
        setName(bike.getName());
    }
    
}

class sportsCar extends vehicle{
    private String name;
    sportsCar(String brand, String model, int year, String name){
        super(brand, model, year);  // super keywored refers to the superclass (parent) of the object
                                    // similar to this keyword which refers to the object itself
        this.name = name;
    }

    sportsCar(sportsCar aSportsCar){
        super(aSportsCar.brand, aSportsCar.model, aSportsCar.year);
        this.name = aSportsCar.name;
        // this.copy(aSportsCar);
    }
    @Override
    void start(){
        System.out.println("shdhk shdhk ......vroom!");
    }
    @Override
    public String toString(){
        return super.toString()+this.name;
    }

    // The type sportsCar must implement the inherited abstract method vehicle.start()Java(67109264)

    String getBrand(){
        return this.brand;
    }
    String getModel(){
        return this.model;
    }
    int getYear(){
        return this.year;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
}