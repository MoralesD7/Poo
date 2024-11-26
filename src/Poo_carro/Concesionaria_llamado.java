package Poo_carro;

import java.util.Scanner;

public class Concesionaria_llamado {
    public static void main(String[] args) {
        //Declaracion de variables
        int n_autos;
        //Objeto scanner
        Scanner sc = new Scanner(System.in);
        //Solicitar la cantidad de autos
        System.out.println("Digita la cantidad de autos que tienes :");
        n_autos = sc.nextInt();
        //Declaracion de objeto
        Concesionaria coche = new Concesionaria(n_autos);
        //for para introducir la marca modelo y precio del auto
        coche.setMarca();
        coche.setModelo();
        coche.setPrecio();
        System.out.println("-----------------------------------------");
        System.out.println("Acontinuacion se muestran los autos con sus especificaciones ");
        coche.getMarca();
        coche.getModelo();
        coche.getPrecio();
        System.out.println("-----------------------------------------");
        System.out.println("\nLa opcion mas viable para ti mi amigo sin dinero es :\n");
        coche.getPrecio_menor();
        coche.getMarca_menor();
        coche.getModelo_menor();
        System.out.println("-----------------------------------------");


    }
}
