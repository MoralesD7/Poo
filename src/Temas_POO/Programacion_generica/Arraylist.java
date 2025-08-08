package Temas_POO.Programacion_generica;

public class Arraylist {
    //declaro un array de objetos para que se guarden elementos de todo tipo
    private Object[] dato_elemento;
    //declaro un iterador para que aumente cuando agregue un elemento o para buscarlo
    private int i = 0;
    //inicializar el elemento de manera correcta
    public Arraylist (int z ){
        dato_elemento = new Object[z];
    }
    //buscar el elemento
    public Object get(int i ) {

        return dato_elemento[i];
    }
    //add elemento
    public void add (Object o){
        dato_elemento[i] = o ;
        i++;
    }

}
