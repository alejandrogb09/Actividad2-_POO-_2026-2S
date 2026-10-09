package Actividad2;

public class Rectangulo {
    int base;
    int height;
    
    Rectangulo(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    double calculateArea() {
        return base * height;
    }
    
    double calculatePerimeter() {
        return (2 * base) + (2 * height);
    }
}
