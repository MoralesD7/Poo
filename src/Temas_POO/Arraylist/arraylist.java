package Temas_POO.Arraylist;
//necesitamos importar la libreria
import java.util.ArrayList;

public class arraylist {
    //veremos el tema de array list wuiii
    /*ventajas
    * Un ArrayList tiene un tamaño dinámico, mientras que el de un Array es definido en su creación.
    Un ArrayList no puede contener datos primitivos, sólo Objetos.
    El ArrayList permite comprobar que los datos que se añaden a la colección son del tipo correcto en tiempo de compilación.
    El Array puede ser de varias dimensiones, el ArrayList es unidimensional (aunque pueda ser un ArrayList de ArrayLists). */
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("negro");
        colores.add("blanco");
        colores.add("verde");
        System.out.println("array principal"+colores);

        //Metodo para arraylist
        colores.get(0); // obtener la primer posicion de array
        colores.set(1,"aqua");
        String removido = colores.remove(0);
        System.out.println("color removido "+removido);
        System.out.println("array cambiado "+colores);
        //para eliminar todos los elementos utilizar clear ();

    }

}
