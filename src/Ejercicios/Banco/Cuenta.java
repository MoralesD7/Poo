package Ejercicios.Banco;

import java.util.Scanner;

public class Cuenta {
    // Objeto scanner de manera global
    static Scanner sc = new Scanner(System.in);

    // Método para mostrar los datos de todas las cuentas
    public static void Mostrar_datos(Cliente persona[]) {
        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i].toString());
        }
    }

    // Método para agregar saldo a un cliente dependiendo de su ID
    public static void Agregar_saldo(Cliente persona[]) {
        System.out.println("Digita el ID del cliente para agregar el saldo correspondiente: ");
        int id_comparacion = sc.nextInt();
        int saldo_agregado;
        boolean encontrado = false;

        // Buscar el cliente por ID
        for (int i = 0; i < persona.length; i++) {
            if (id_comparacion == persona[i].getId()) {
                System.out.println("Agrega la cantidad de saldo que desees: ");
                saldo_agregado = sc.nextInt();

                // Actualizar el saldo del cliente
                int nuevoSaldo = persona[i].getSaldo() + saldo_agregado;
                persona[i].setSaldo(nuevoSaldo);

                System.out.println("Saldo actualizado. Su saldo actual es: " + nuevoSaldo);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún cliente con el ID proporcionado.");
        }
    }

    // Método para quitar saldo a un cliente dependiendo de su ID
    public static void Quitar_saldo(Cliente persona[]) {
        System.out.println("Digita el ID del cliente para retirar el saldo correspondiente: ");
        int id_comparacion = sc.nextInt();
        int saldo_retirado;
        boolean encontrado = false;

        // Buscar el cliente por ID
        for (int i = 0; i < persona.length; i++) {
            if (id_comparacion == persona[i].getId()) {
                System.out.println("Ingresa la cantidad de saldo que deseas retirar: ");
                saldo_retirado = sc.nextInt();

                if (persona[i].getSaldo() >= saldo_retirado) {
                    // Actualizar el saldo del cliente
                    int nuevoSaldo = persona[i].getSaldo() - saldo_retirado;
                    persona[i].setSaldo(nuevoSaldo);

                    System.out.println("Saldo actualizado. Su saldo actual es: " + nuevoSaldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún cliente con el ID proporcionado.");
        }
    }

    // Método main
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int id;
        int saldo = 0;
        String numero_cuenta;
        int numero_clientes;

        // Solicitar la cantidad de clientes
        System.out.println("Digita cuál será el número de clientes que agregarás: ");
        numero_clientes = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        // Creación del arreglo de objetos
        Cliente[] persona = new Cliente[numero_clientes];

        // Solicitar los datos de cada cliente
        for (int i = 0; i < numero_clientes; i++) {
            System.out.println("Buenas tardes, bienvenido a la creación de tu cuenta:");
            System.out.println("El saldo inicial de cliente es 0.");
            System.out.println("Nombre:");
            nombre = sc.nextLine();
            System.out.println("Apellido:");
            apellido = sc.nextLine();
            System.out.println("Se te asignará un número ID: " + i);
            id = i;
            System.out.println("Se te asignará un número de cuenta:");
            numero_cuenta = "0000" + (i + 1);

            // Asignación de datos a cada objeto del arreglo
            persona[i] = new Cliente(nombre, apellido, id, saldo, numero_cuenta);
        }

        // Menú de opciones
        int operacion;
        do {
            System.out.println("\nSeleccione la operación deseada:");
            System.out.println("1 - Visualizar a todos los clientes");
            System.out.println("2 - Agregar saldo a un cliente");
            System.out.println("3 - Quitar saldo a un cliente");
            System.out.println("4 - Salir del programa");
            operacion = sc.nextInt();

            switch (operacion) {
                case 1:
                    Mostrar_datos(persona);
                    break;
                case 2:
                    Agregar_saldo(persona);
                    break;
                case 3:
                    Quitar_saldo(persona);
                    break;
                case 4:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Favor de ingresar valores entre el 1 y el 4.");
            }
        } while (operacion != 4);
    }
}
