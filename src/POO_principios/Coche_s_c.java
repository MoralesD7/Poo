package POO_principios;
//esta es una prueba de que pasa si la clase no tiene metodo constructur
/*el metodo constructor es para asegurar que los datos insertados tengan valores inicializados
antes de inicializar el programa de lo contrario se mostrara un poderoos null o 0 dependiendo del tipo de dato */
public class Coche_s_c {
    String marca ;
    int km ;
    public void Informacion (){
        System.out.println("La marca de mi carro es "+ marca+" la cantidad de km que tiene es :"+ km);
    }

    public static void main(String[] args) {
        Coche_s_c obj = new Coche_s_c();
        obj.Informacion();
    }
}
