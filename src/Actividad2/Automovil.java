package Actividad2;

public class Automovil {
    String brand;
    int model;
    int engine;
    enum TypeFuel{GASOLINE,BIOETHANOL, DIESEL, BIODIESEL, NATURAL_GAS}
    TypeFuel typeFuel;
    enum TypeCar{CITY, SUBCOMPACT, COMPACT, FAMILIAR, STATION_WANG, EXECUTIVE, SUV}
    TypeCar typeCar;
    int numberDoors;
    int numberSeats;
    int maxSpeed;
    enum TypeColor{WHITE, BLACK, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET}
    TypeColor color;
    int actualSpeed;
    boolean isAutomatic;
    
    int totalFinesCount = 0;      
    double totalFinesAmount = 0;  
    
    Automovil(String brand, int model, int engine, TypeFuel typeFuel, TypeCar typeCar, int numberDoors, int numberSeats, int maxSpeed, TypeColor color, boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.typeFuel = typeFuel;
        this.typeCar = typeCar;
        this.numberDoors = numberDoors;
        this.numberSeats = numberSeats;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }
    
    String getBrand() {
        return brand;
    }
    
    int getModel() {
        return model;
    }
    
    int getEngine() {
        return engine;
    }
    
    TypeFuel getTypeFuel() {
        return typeFuel;
    }
    
    TypeCar getTypeCar() {
        return typeCar;
    }
    
    int getNumberDoors() {
        return numberDoors;
    }
    
    int getNumberSeats() {
        return numberSeats;
    }
    
    int getMaxSpeed() {
        return maxSpeed;
    }
    
    int getActualSpeed() {
        return actualSpeed;
    }
    
    boolean getIsAutomatic() {
        return isAutomatic;
    }
    
    void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
    
    void setBrand(String brand) {
        this.brand = brand;
    }
    
    void setModel(int model) {
        this.model = model;
    }
    
    void setEngine(int engine) {
        this.engine = engine;
    }
    
    void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }
    
    void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }
    
    void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
    
    void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
    
    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    void setColor(TypeColor color) {
        this.color = color;
    }
    
    void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }
    
    void acelerate(int speedIncrease) {
        if ((actualSpeed + speedIncrease) <= maxSpeed) {
            actualSpeed = actualSpeed + speedIncrease;
        } else {
            System.out.println("You cannot accelerate at a speed greater than the car's maximum speed. Fine generated!");
            totalFinesCount++;            
            totalFinesAmount += 150.0;    
        }
    }
    
    void slowDown(int speedDecrease) {
        if ((actualSpeed - speedDecrease) > 0) {
            actualSpeed  = actualSpeed - speedDecrease;
        } else {
            System.out.println("You cannot decrement at a negative rate.");
        }
    }
    
    void stop() {
        actualSpeed = 0;
    }
    
    double estimateArrivalTime(int distance) {
        return distance / actualSpeed;
    }
    
    boolean hasFines() {
        return totalFinesCount > 0;
    }
    
    double getTotalFinesAmount() {
        return totalFinesAmount;
    }
    
    void print() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Type of Fuel: " + typeFuel);
        System.out.println("Type of Car: " + typeCar);
        System.out.println("Number of Doors: " + numberDoors);
        System.out.println("Number of Seats: " + numberSeats);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Color: " + color);
        System.out.println("Is Automatic: " + isAutomatic);
    }
}
