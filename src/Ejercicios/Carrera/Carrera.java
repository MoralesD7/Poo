package Ejercicios.Carrera;

import java.util.Scanner;

public class Carrera {
    public static int i_mejor_corredor(Corredor participante[]){
        int m_tiempo  = participante[0].getTiempo_d_carrera();
        int v_aux = 0;

        for(int i = 1 ; i < participante.length; i++ ){
            if(participante[i].getTiempo_d_carrera() < m_tiempo){
                m_tiempo = participante[i].getTiempo_d_carrera();
                v_aux = i;
            }
        }
        return v_aux;
    }

    public static void main(String[] args) {
        int n_corredores;
        int n_corredor;
        String name_corredor;
        int t_corredor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digita la cantidad de corredores:");
        n_corredores = sc.nextInt();
        sc.nextLine(); // Para limpiar el salto de línea después de nextInt()

        Corredor participante[] = new Corredor[n_corredores];

        for(int i = 0; i < n_corredores; i++) {
            System.out.println("Digita el número del corredor " + (i + 1) + ":");
            n_corredor = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea

            System.out.println("Digita el nombre del corredor " + (i + 1) + ":");
            name_corredor = sc.nextLine();

            System.out.println("Digita el tiempo del corredor " + (i + 1) + ":");
            t_corredor = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea

            participante[i] = new Corredor(n_corredor, name_corredor, t_corredor);
        }

        int M_t = i_mejor_corredor(participante);
        System.out.println("El participante con mejor tiempo fue:");
        System.out.println(participante[M_t].M_datos());
    }
}
