package Temas_POO.Metodo_onstructor;
//esta es una prueba de que pasa si la clase  tiene metodo constructor
/*el metodo constructor es para asegurar que los datos insertados tengan valores inicializados
antes de inicializar el programa de lo contrario se mostrara un poderoos null o 0 dependiendo del tipo de dato */
public class Coche_c_c {
    String marca ;
    int km ;
    //La palabra reservada this es para verificar que son diferentes variables aunque con nombre igual
    /*tambien se pueden ocupar nombres distintos depende de la persona */
    public Coche_c_c(String marca , int km) {
        this.marca = marca;
        this.km = km;
    }

    public void Informacion (){
        System.out.println("La marca de mi carro es "+ marca+" la cantidad de km que tiene es :"+ km);
    }

    public static void main(String[] args) {
        Coche_c_c obj = new Coche_c_c("toyota",200);
        obj.Informacion();
    }
}
