package Actividad2;

public class Planeta {
    String name = null;
    int numberSatellite = 0;
    double mass = 0;
    double volume = 0;
    int diameter = 0;
    int distanceSun = 0;
    enum PlanetType {GASEOUS, TERRESTRIAL, DWARF}
    PlanetType type;
    boolean isObservable = false;
    double orbitalPeriod = 0;
    double rotationPeriod = 0;
    
    Planeta(String name, int numberSatellite, double mass, double volume, int diameter, int distanceSun, PlanetType type, boolean isObservable, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.numberSatellite = numberSatellite;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.type = type;
        this.isObservable = isObservable;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }
    
    void print() {
        System.out.println("Name of the planet: " + name);
        System.out.println("Number of satellites: " + numberSatellite);
        System.out.println("Mass of the planet: " + mass);
        System.out.println("Volume of the planet: " + volume);
        System.out.println("Diameter of the planet: " + diameter);
        System.out.println("Distance from the sun (M km): " + distanceSun);
        System.out.println("Type of planet: " + type);
        System.out.println("Is it observable: " + isObservable);
        System.out.println("The orbital period is (years): " + orbitalPeriod);
        System.out.println("The rotation period is (days): " + rotationPeriod);
    }
    
    double calculateDensity() {
        return mass / volume;
    }
    
    boolean isOuterPlanet() {
        double distanceInUA = this.distanceSun / 149.597870;
        
        return distanceInUA > 3.4;
    }
}