package Actividad2;

public class Ejercicio4PruebaFiguras {
    public static void main(String[] args) {
        Circulo figure1 = new Circulo(2);
        Rectangulo figure2 = new Rectangulo(1, 2);
        Cuadrado figure3 = new Cuadrado(3);
        TrianguloRectangulo figure4 = new TrianguloRectangulo(3, 5);
        Rombo figure5 = new Rombo(8, 6, 5);
        Trapecio figure6 = new Trapecio(10, 6, 4, 5, 5);
        
        System.out.println("The area of the circle is: " + figure1.calculateArea());
        System.out.println("The perimeter of the circle is: " + figure1.calculatePerimeter());
        System.out.println();
        System.out.println("The area of the rectangle is: " + figure2.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + figure2.calculatePerimeter());
        System.out.println();
        System.out.println("The area of the square is: " + figure3.calculateArea());
        System.out.println("The perimeter of the square is: " + figure3.calculatePerimeter());
        System.out.println();
        System.out.println("The area of the triangle is: " + figure4.calculateArea());
        System.out.println("The perimeter of the triangle is: " + figure4.calculatePerimeter());
        figure4.determineTrianguleType();
        System.out.println();
        System.out.println("The area of the rhombus is: " + figure5.calculateArea());
        System.out.println("The perimeter of the rhombus is: " + figure5.calculatePerimeter());
        System.out.println();
        System.out.println("The area of the trapezoid is: " + figure6.calculateArea());
        System.out.println("The perimeter of the trapezoid is: " + figure6.calculatePerimeter());
    }
}
