package Actividad2;

public class Ejercicio3 {
    public static void main(String[] args) {
        Automovil car1 = new Automovil("Ford", 2018, 3, Automovil.TypeFuel.DIESEL, Automovil.TypeCar.EXECUTIVE, 5, 6, 250, Automovil.TypeColor.BLACK, true);
        
        car1.print();
        car1.setActualSpeed(240);
        System.out.println("Actual Speed: " + car1.actualSpeed);
        
        car1.acelerate(20); 
        
        car1.acelerate(15); 
        
        System.out.println("Does the car have fines? " + car1.hasFines());
        System.out.println("Total value of fines: $" + car1.getTotalFinesAmount());
    }
}
