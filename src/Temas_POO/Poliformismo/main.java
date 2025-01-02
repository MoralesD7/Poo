package Temas_POO.Poliformismo;

public class main {
    public static void main(String[] args) {
        //creacion de objeto de la clase padre con cualidades de las hijas
        Vehiculo carrito_jesse = new mercedes("capitancook","elcamino","1998",500);
        Vehiculo carro_dla_perra = new chevrolet("Skyler_bitch","camionetafea","2000",400);
        System.out.println(carrito_jesse);
        System.out.println(carro_dla_perra);
    }
}
