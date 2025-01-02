package Ejercicios.Poligono;

import java.util.ArrayList;
import java.util.Scanner;

public class metodos {
    static ArrayList<Poligono> poligonito = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void Menu() {
        int mainOption, op;
        String respuesta, respuesta_valid;

        do {
            // Submenú principal
            do {
                System.out.println("Selecciona una opción:");
                System.out.println("1. Mostrar todos los polígonos actuales");
                System.out.println("2. Agregar un nuevo polígono");
                System.out.print("Opción: ");
                mainOption = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
            } while (mainOption < 1 || mainOption > 2);

            switch (mainOption) {
                case 1:
                    // Mostrar todos los polígonos
                    if (poligonito.isEmpty()) {
                        System.out.println("No hay polígonos agregados aún.");
                    } else {
                        System.out.println("Lista de polígonos:");
                        for (Poligono poligono : poligonito) {
                            System.out.println(poligono);
                        }
                    }
                    break;

                case 2:
                    // Submenú para agregar polígonos
                    do {
                        System.out.println("Selecciona qué polígono deseas incluir:");
                        System.out.println("1. Rectángulo");
                        System.out.println("2. Triángulo isósceles");
                        System.out.print("Opción: ");
                        op = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer
                    } while (op < 1 || op > 2);

                    switch (op) {
                        case 1:
                            rellenar_rectangulo();
                            break;
                        case 2:
                            rellenar_triangulo();
                            break;
                    }
                    break;
            }

            // Preguntar si se desea continuar
            System.out.println("¿Deseas realizar otra acción?");
            System.out.print("Si / No: ");
            respuesta = sc.nextLine();
            respuesta_valid = respuesta.toLowerCase();
        } while (respuesta_valid.equals("si"));
    }

    public static void rellenar_rectangulo() {
        int base, altura;
        System.out.println("Digite la base del rectángulo:");
        base = sc.nextInt();
        System.out.println("Digite la altura del rectángulo:");
        altura = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        Rectangulo obj = new Rectangulo(2, base, altura);
        poligonito.add(obj);
        System.out.println("Rectángulo agregado exitosamente.");
    }

    public static void rellenar_triangulo() {
        int base, altura, altura_2;
        do {
            System.out.println("Digite la base del triángulo:");
            base = sc.nextInt();
            System.out.println("Digite un lado del triángulo:");
            altura = sc.nextInt();
            System.out.println("Digite el otro lado del triángulo:");
            altura_2 = sc.nextInt();
            if (altura != altura_2) {
                System.out.println("El triángulo isósceles tiene 2 lados iguales. Digita de nuevo.");
            }
        } while (altura != altura_2);
        sc.nextLine(); // Limpiar el buffer
        Triangulo_isoceles obj = new Triangulo_isoceles(3, base, altura, altura_2);
        poligonito.add(obj);
        System.out.println("Triángulo isósceles agregado exitosamente.");
    }
}
