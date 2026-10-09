package Actividad2;

public class Cuadrado {
    int side;
    
    public Cuadrado(int side) {
        this.side = side;
    }
    
    double calculateArea() {
        return Math.pow(side, 2);
    }
    
    double calculatePerimeter() {
        return 4 * side;
    }
}
