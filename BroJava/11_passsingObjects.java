package BroJava;

class Car{
    String carName;

    Car(String carName){
        this.carName = carName;
    }
}

class Garage{
    Car carInstance;
    int capacity;
    Car[] cars = new Car[10];

    Garage(){
        this.carInstance = null;
        this.capacity = 10;
    }

    void addCar(Car car){
        this.carInstance = car;
        appendCars(this.carInstance);
    }   
    Car[] appendCars(Car car){
        for (int i = 0; i < cars.length; i++) {
            if (isGarageFull()) {
                break;
            }
            else if(cars[i] == null){
                cars[i] = car;
                capacity--;
                System.out.println( car.carName + " added to the garage");
                break;
            }
        }
        return cars;
    }
    boolean isGarageFull(){
        if(capacity == 0){
            System.out.println("Garage is full!");
            return true;
        }
        return false;
    }
}

class passingObjects{
public static void main(String[] args) {
    Car myCar = new Car("BMW");
    Car myCar2 = new Car("Audi");
    Car myCar3 = new Car("Mercedes");
    Car myCar4 = new Car("Toyota");
    Car myCar5 = new Car("Honda");
    Car myCar6 = new Car("Ford");
    Car myCar7 = new Car("Chevrolet");
    Car myCar8 = new Car("Hyundai");
    Car myCar9 = new Car("Kia");
    Car myCar10 = new Car("Nissan");
    Car myCar11 = new Car("Volkswagen");
    Garage myGarage = new Garage();
    myGarage.addCar(myCar);
    myGarage.addCar(myCar2);
    myGarage.addCar(myCar3);
    myGarage.addCar(myCar4);
    myGarage.addCar(myCar5);
    myGarage.addCar(myCar6);
    myGarage.addCar(myCar7);
    myGarage.addCar(myCar8);
    myGarage.addCar(myCar9);
    myGarage.addCar(myCar10);
    myGarage.addCar(myCar11);

    }
}