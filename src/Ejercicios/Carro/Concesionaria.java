package Ejercicios.Carro;

import java.util.Scanner;

public class Concesionaria {
    // Declaración de variables
    private int n_autos;
    private int v_aux_precio_menor, posicion_menor; // Solo necesitamos una posición
    private String v_aux_marca_menor, v_aux_modelo_menor;

    // Objeto scanner
    Scanner sc = new Scanner(System.in);

    // Arreglos
    private String[] Marca;
    private String[] Modelo;
    private int[] Precio;

    // Constructor
    public Concesionaria(int n_autos) {
        this.n_autos = n_autos;
        initialize();
    }

    // Inicializar los arreglos
    public void initialize() {
        Marca = new String[n_autos];
        Modelo = new String[n_autos];
        Precio = new int[n_autos];
    }

    // Métodos set para establecer la marca, modelo y precio del auto
    public void setMarca() {
        for (int i = 0; i < n_autos; i++) {
            System.out.println("Digita la marca de tu auto numero: " + i);
            Marca[i] = sc.nextLine();
        }
    }

    public void setModelo() {
        for (int i = 0; i < n_autos; i++) {
            System.out.println("Digita el modelo de tu auto numero: " + i);
            Modelo[i] = sc.nextLine();
        }
    }

    public void setPrecio() {
        for (int i = 0; i < n_autos; i++) {
            System.out.println("Digita el precio de tu auto numero: " + i);
            Precio[i] = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada después de nextInt()
        }
    }

    // Métodos get para obtener los valores de cada auto
    public void getMarca() {
        for (int i = 0; i < n_autos; i++) {
            System.out.println("La marca del auto " + i + " es: " + Marca[i]);
        }
    }

    public void getModelo() {
        for (int i = 0; i < n_autos; i++) {
            System.out.println("El modelo del auto " + i + " es: " + Modelo[i]);
        }
    }

    public void getPrecio() {
        for (int i = 0; i < n_autos; i++) {
            System.out.println("El precio del auto " + i + " es: " + Precio[i]);
        }
    }

    // Método para obtener el precio más bajo y su posición
    public int getPrecio_menor() {
        v_aux_precio_menor = Precio[0];
        posicion_menor = 0; // Inicializamos la posición en 0

        // Recorremos el arreglo de precios desde el segundo elemento
        for (int i = 1; i < n_autos; i++) {
            if (Precio[i] < v_aux_precio_menor) {
                v_aux_precio_menor = Precio[i];
                posicion_menor = i;  // Actualizamos la posición del precio menor
            }
        }
        System.out.println("El precio del auto más barato es: " + v_aux_precio_menor);
        return v_aux_precio_menor;
    }

    public String getMarca_menor() {
        v_aux_marca_menor = Marca[posicion_menor];
        System.out.println("La marca del auto más barato es: " + v_aux_marca_menor);
        return v_aux_marca_menor;
    }

    public String getModelo_menor() {
        v_aux_modelo_menor = Modelo[posicion_menor];
        System.out.println("El modelo del auto más barato es: " + v_aux_modelo_menor);
        return v_aux_modelo_menor;
    }
}
