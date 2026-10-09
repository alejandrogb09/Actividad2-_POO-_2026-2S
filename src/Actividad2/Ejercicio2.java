package Actividad2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Earth", 1, 5.9736E24, 1.08321E12, 12742, 150, Planeta.PlanetType.TERRESTRIAL, true, 1.0, 1.0);
        p1.print();
        System.out.println("Density of the planet = " + p1.calculateDensity());
        System.out.println("Is it an outer planet = " + p1.isOuterPlanet());
        System.out.println();
        
        Planeta p2 = new Planeta("Jupiter", 79, 1.899E27, 1.4313E15, 139820, 778, Planeta.PlanetType.GASEOUS, true, 11.86, 0.41);
        p2.print();
        System.out.println("Density of the planet = " + p2.calculateDensity());
        System.out.println("Is it an outer planet = " + p2.isOuterPlanet());
        System.out.println();
    }
}