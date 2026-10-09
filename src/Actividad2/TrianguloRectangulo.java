package Actividad2;

public class TrianguloRectangulo {
    int base;
    int height;
    
    public TrianguloRectangulo(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    double calculateArea() {
        return (base * height) / 2;
    }
    
    double calculatePerimeter() {
        return (base + height + calculateHypotenuse());
    }
    
    double calculateHypotenuse() {
        return Math.pow((Math.pow(base, 2) + Math.pow(height, 2)), 0.5);
    }
    
    void determineTrianguleType() {
        if ((base == height) && (base == calculateHypotenuse()) && (height== calculateHypotenuse())) {
            System.out.println("It is an equilateral triangle");
        } else if ((base != height) && (base != calculateHypotenuse()) && (height != calculateHypotenuse())) {
            System.out.println("It is a scalene triangle");
        } else {
            System.out.println("It is an isosceles triangle");
        }
    }
}
