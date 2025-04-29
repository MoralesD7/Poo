package Ejercicios.Dados;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Juego_dados obj = new Juego_dados();
        Dado [] dados = new Dado[3];
        // Crear los objetos Dado dentro del arreglo
        for (int i = 0; i < dados.length; i++) {
            dados[i] = new Dado();
        }
        System.out.println("Bienvenido a tu jueguito de dado Digita 1 para comenzar:");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if(opcion== 1){
            obj.Imprimir_valores(dados);
            System.out.println("\n"+obj.Mostrar_resultado(dados));
        }else{
            System.out.println("Digita 1 ciego ");
        }
    }
}
