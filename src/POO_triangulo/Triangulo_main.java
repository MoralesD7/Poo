package POO_triangulo;

import java.util.Scanner;

public class Triangulo_main {

    public static int Trian_mayor(Triangulo isoseles[]) {
        int trian_mayor = isoseles[0].getArea();
        int v_aux = 0;
        for (int i = 1; i < isoseles.length; i++) {  // Comienza en 1 para evitar comparar con sí mismo
            if (isoseles[i].getArea() > trian_mayor) {  // Ahora buscamos el mayor, no el menor
                trian_mayor = isoseles[i].getArea();
                v_aux = i;
            }
        }
        return v_aux;
    }

    public static void main(String[] args) {
        int lad, base, c_triangulos;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digita la cantidad de triángulos que deseas:");
            c_triangulos = sc.nextInt();
        } while (c_triangulos <= 0);

        Triangulo isoseles[] = new Triangulo[c_triangulos];

        for (int i = 0; i < c_triangulos; i++) {
            System.out.println("Digita el lado del triángulo " + (i + 1) + ":");
            lad = sc.nextInt();
            System.out.println("Digita la base del triángulo " + (i + 1) + ":");
            base = sc.nextInt();

            isoseles[i] = new Triangulo(lad, base);
        }

        int M_t = Trian_mayor(isoseles);
        System.out.println("El triángulo con el mayor área es el triángulo número: " + (M_t + 1));
        isoseles[M_t].mostrarDatos();  // Mostrar los datos del triángulo con el mayor área
    }
}
