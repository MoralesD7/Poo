package Temas_POO.Herencia;

public class Estudiante extends Persona {
    //creacion de variables  internas de la clase
    private int numero_boleta;
    private String estado ;

    //creacion del constructor
    public Estudiante(String nombre ,String apellido ,int edad , int numero_boleta, String estado){
        //la palabra reservada super se utiliza para inicializar los objetos correspondientes
        super(nombre, apellido, edad);
        this.numero_boleta = numero_boleta;
        this.estado = estado;
    }


    public String Mostrar_datos(){
        //para poder acceder a los datos de la clase persona o accedes a sus metodos directamente o cambias el private por protected cualquiera de las dos
        return "El nombre del alumno es "+getNombre()+" "+getApellido()+"su edad es :"+getEdad()
                +"su numero de boleta es :"+numero_boleta+"y su estado actual es "+estado;
    }
}
