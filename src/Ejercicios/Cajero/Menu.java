package Ejercicios.Cajero;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Atributos
        String nombre ;
        String apellido ;
        int numero_cuenta;
        int saldo = 0 ;
        int Cantidad_usuarios;
        //arreglo de objetos
        Cliente [] cliente ;
        //variable para switch
        int opcion ;

        //creacion del objeto scanner
        Scanner sc = new Scanner(System.in);

        //Solicitar al dueño del banco que ingrese el numero de usuarios que desee registrar
        System.out.println("Digite la cantidad de usuarios que tiene la empresa :");
        Cantidad_usuarios= sc.nextInt();

        //creacion del arreglo de objetos
        cliente = new Cliente[Cantidad_usuarios];
        sc.nextLine();
        //Bucle para registrar datos  de usuarios deseados
        for(int i = 0; i< cliente.length;i++){
            //entrada de informacion
            System.out.println("Digita el nombre del empleado :"+ (i+1));
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido de la persona :");
            apellido = sc.nextLine();
            System.out.println("El saldo inicial del cliente es : 0");
            System.out.println("Su numero de cuenta es :");
            numero_cuenta = i+1;
            System.out.println(numero_cuenta);
            //Asignacion de datos al arreglo
            cliente [i] = new Cliente(nombre,apellido,numero_cuenta,saldo);
        }

        //creacion de menu
        System.out.println("----------------------");
        System.out.println("Opciones del programa");
        System.out.println("----------------------");
        System.out.println("\n1.Mostrar lista de usuarios");
        System.out.println("\n2.Mostrar saldo individual cda/cliente");
        System.out.println("\n3.Introducir saldo");
        System.out.println("\n4.Retirar saldo");
        System.out.println("\n5.Salir del programa");

        do{
            System.out.println("Digite la opcion deseada :");
            //seleccion de opcion deseada
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    Cajero.Mostrar_usuarios(cliente);
                    break;
                case 2 :
                    Cajero.Mostrar_saldo(cliente);
                    break;
                case 3:
                    Cajero.Agregar_saldo(cliente);
                    break;
                case 4:
                    Cajero.Sacar_dinero(cliente);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Digita valores del 1 al 5 porfavor");
            }
        }while(opcion!=5);
    }
}
