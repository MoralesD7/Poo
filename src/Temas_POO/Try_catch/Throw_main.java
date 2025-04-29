package Temas_POO.Try_catch;

import java.util.Scanner;

public class Throw_main {
    static Scanner sc = new Scanner(System.in);
    public void Intro_numeros() throws Throw{
        int numero;
        do {
            System.out.println("Digita el numero que desees :");
             numero = sc.nextInt();

             if(numero == 0 ){
                 throw new Throw();
             }
        }while (numero !=0);

    }
    public static void main(String[] args) throws Throw {
        Throw_main obj = new Throw_main();
        try{
            obj.Intro_numeros();
        }catch (Throw e ){
            System.out.println("Has digitado el numero 0");
        }finally {
            System.out.println("Programa terminado");
        }
    }
}
