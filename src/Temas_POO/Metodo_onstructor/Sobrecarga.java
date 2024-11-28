package Temas_POO.Metodo_onstructor;
//la sobrecarga de metodos es la creacion de varios metodos con el mismo nombre pero dif parametros
public class Sobrecarga {
    String marca ;
    int km ;
    int M_usados;
    //La palabra reservada this es para verificar que son diferentes variables aunque con nombre igual
    /*tambien se pueden ocupar nombres distintos depende de la persona */
    public Sobrecarga(String marca , int km) {
        this.marca = marca;
        this.km = km;
    }
    public Sobrecarga(int M_usados){
        this.M_usados = M_usados;
    }
    public void Informacion (String marca , int km){
        System.out.println("La marca de mi carro es "+ marca+" la cantidad de km que tiene es :"+ km);
    }
    public void Informacion (int M_usados){
        System.out.println("Tiene "+ M_usados+" meses de uso ");
    }

    public static void main(String[] args) {
        Sobrecarga obj = new Sobrecarga("toyota",200);
        //se quedara con los argumentos que yo le mande al metodo no al objeto
        obj.Informacion("toyota ",200);
        Sobrecarga obj_2 = new Sobrecarga(5);
        obj_2.Informacion(5);

    }
}
