package Actividad2;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Perez", "1053121010", 1998, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "Leon", "12566281", 2001, "Colombia", 'H');
        Persona p3 = new Persona("Keisy", "Petro", "1064195231", 2008, "Colombia", 'M');
        
        p1.print();
        p2.print();
        p3.print();
    }
}
