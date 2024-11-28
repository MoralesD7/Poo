package Ejercicios.Calculo_complejos;

import java.util.Scanner;

public class Menu {
    public static String sumaComplejos(Numeros operacion[]) {
        int sumaReales = 0;
        int sumaImaginarios = 0;
        for (int i = 0; i < 2; i++) {
            sumaReales += operacion[i].getN_real();
            sumaImaginarios += operacion[i].getN_imaginario();
        }
        return "La operación dio como resultado el siguiente binomio \n" +
                sumaReales + " + " + sumaImaginarios + "i";
    }

    public static String multiplicacionComplejos(Numeros operacion[]) {
        int mulReales = operacion[0].getN_real() * operacion[1].getN_real() -
                operacion[0].getN_imaginario() * operacion[1].getN_imaginario();
        int mulImaginarios = operacion[0].getN_real() * operacion[1].getN_imaginario() +
                operacion[0].getN_imaginario() * operacion[1].getN_real();

        return "La multiplicación de los binomios dio como resultado \n" +
                mulReales + " + " + mulImaginarios + "i";
    }

    public static String igualdadComplejos(Numeros operacion[]) {
        boolean igualdadReal = operacion[0].getN_real() == operacion[1].getN_real();
        boolean igualdadImaginario = operacion[0].getN_imaginario() == operacion[1].getN_imaginario();

        if (igualdadReal && igualdadImaginario) {
            return "Ambos números complejos son iguales.";
        } else {
            return "Los números complejos no son iguales.";
        }
    }

    public static String mulEnteroComplejo(Numeros operacion[], int entero) {
        int mulReal = entero * operacion[0].getN_real();
        int mulImaginario = entero * operacion[0].getN_imaginario();

        return "El binomio resultante de la multiplicación es " +
                mulReal + " + " + mulImaginario + "i";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros[] operacion = new Numeros[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digita un número real:");
            int numeroReal = sc.nextInt();
            System.out.println("Digita un número imaginario:");
            int numeroImaginario = sc.nextInt();

            operacion[i] = new Numeros(numeroReal, numeroImaginario);
        }

        int opcion;
        do {
            System.out.println("Selecciona la opción del menú que desees:");
            System.out.println("1. Suma de dos números complejos");
            System.out.println("2. Multiplicar dos números complejos");
            System.out.println("3. Comparar 2 números complejos");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(sumaComplejos(operacion));
                    break;
                case 2:
                    System.out.println(multiplicacionComplejos(operacion));
                    break;
                case 3:
                    System.out.println(igualdadComplejos(operacion));
                    break;
                case 4:
                    System.out.println("Digita el entero para la multiplicación:");
                    int entero = sc.nextInt();
                    System.out.println(mulEnteroComplejo(operacion, entero));
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }
}
