package TP1_Lombok_Basico;

public class MainTP1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(25);

        Persona persona2 = new Persona("Maria", 30);

        System.out.println("Persona1: " + persona1.getNombre() + ", " + persona1.getEdad());
        System.out.println("Persona2: " + persona2.getNombre() + ", " + persona2.getEdad());
    }
}