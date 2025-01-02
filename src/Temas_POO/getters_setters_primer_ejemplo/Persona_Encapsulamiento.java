package Temas_POO.getters_setters_primer_ejemplo;

public class Persona_Encapsulamiento {
    //un nombre se puede definir como una constante por que no cambia
    private String nombre;
    private int edad;
    //para buenas practicas pondremos el constructor vacio para que no haya problemas al inicializarlo
    public Persona_Encapsulamiento(){

    }
    //sobrecarga del constructor
    public Persona_Encapsulamiento(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo tostring se utiliza para mostrar los datos de la clase


    @Override
    public String toString() {
        return "el nombre de la persona es :"+ nombre+ "su edad es :"+edad;

    }
}
