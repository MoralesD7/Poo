package Temas_POO.Programacion_generica;

public class elementos {
    public static void main(String[] args) {
        Arraylist numero  = new Arraylist(5);
        numero.add("Omar");
        numero.add("San");
        String nombre = (String) numero.get(1);//al no depende de clases genericas se tiene que castear
        System.out.println(nombre);
        /*la clase arraylist tiene como cualidad el uso de  programacion generica
        *
        * Arraylist<Parametro de tipo> nombre de la lista = new .....;
        * desventajas de no usar programacion generica es el uso constante de casteo
        * complicaciones en el codigo
        * no posibilidad de comprobar errores 
        * */

    }
}
