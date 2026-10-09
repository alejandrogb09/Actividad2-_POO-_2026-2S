package Actividad2;

public class Circulo {
    int radius;
    
    Circulo(int radius) {
        this.radius = radius;
    }
    
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
