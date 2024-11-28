package Temas_POO.getters_setters_primer_ejemplo;

public class Persona_Encapsulamiento {
    //un nombre se puede definir como una constante por que no cambia
    private final String nombre;
    private int edad;

    public Persona_Encapsulamiento(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Info() {
        System.out.println("Hola mi nombre es " + nombre + " mi edad es :" + edad);
    }
}
