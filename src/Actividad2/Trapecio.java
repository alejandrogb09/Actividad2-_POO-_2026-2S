package Actividad2;

public class Trapecio {
    double longerBase;
    double shorterBase;
    double height;
    double side1;
    double side2;
    
    public Trapecio(double longerBase, double shorterBase, double height, double side1, double side2) {
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    double calculateArea() {
        return ((longerBase + shorterBase) * height) / 2;
    }
    
    double calculatePerimeter() {
        return longerBase + shorterBase + side1 + side2;
    }
}
