package POO_principios;
/*
Es un ejemplo de como crear una clase , creacion de metodos , creacion de objeto y
asignacion de valores a los atributos
* */
import javax.swing.*;

public class Persona {
    //declaracion de variables
    String nombre;
    int edad;

    //creacion de metodos
    public void Insertar_info() {
        nombre = (JOptionPane.showInputDialog("Inserta tu nombre :"));
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digita tu nombre"));
    }

    public void Mostrar_info() {
        JOptionPane.showMessageDialog(null,
                "Hola mi nombre es :" + nombre + "mi edad es :" + edad);
    }

    public static void main(String[] args) {
        //creacion del objeto 1
        Persona obj_1 = new Persona();
        //invocacion de los metodos para el objeto 1
        obj_1.Insertar_info();
        obj_1.Mostrar_info();

        //Acceder a los atributos desde el objeto y asignarlos
        Persona obj_2 = new Persona();
        obj_2.nombre = "San";
        obj_2.edad = 18;
        System.out.println("Hola mi nombre es "+ obj_2.nombre+" y mi edad es :"+obj_2.edad);
    }
}
