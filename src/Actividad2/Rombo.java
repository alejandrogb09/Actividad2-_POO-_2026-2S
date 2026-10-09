package Actividad2;

public class Rombo {
    double longerDiagonal;
    double shorterDiagonal;
    double side;
    
    public Rombo(double longerDiagonal, double shorterDiagonal, double side) {
        this.longerDiagonal = longerDiagonal;
        this.shorterDiagonal = shorterDiagonal;
        this.side = side;
    } 
    
    double calculateArea() {
        return (longerDiagonal * shorterDiagonal) / 2;
    }
    
    double calculatePerimeter() {
        return 4 * side;
    }
}
