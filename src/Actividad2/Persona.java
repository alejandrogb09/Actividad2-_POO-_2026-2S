package Actividad2;

public class Persona {
    String name;
    String lastName;
    String idDocument;
    int yearBirth;
    String country;
    char gender;
    
    Persona(String name, String lastName, String idDocument, int yearBirth, String country, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.idDocument = idDocument;
        this.yearBirth = yearBirth;
        this.country = country;
        this.gender = gender;
    }
    
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Identification Document: " + idDocument);
        System.out.println("Year of Birth: " + yearBirth);
        System.out.println("Country of Birth: " + country);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
    
}
