package Ejercicios.Cajero;

import java.awt.*;
import java.util.Scanner;

public class Cajero {
    //Scanner de manera global
    public static Scanner sc = new Scanner(System.in);
    //se deben crear los metodos correspondientes de un cajero
    /*
    1.Mostrar clientes
    2.Mostrar saldo
    3.Introducir efectivo
    4.Retirar efectivo
    */
    //Metodo static para mostrar los usuarios
    public static void Mostrar_usuarios(Cliente cliente[]){
        for(int i = 0 ; i < cliente.length ; i++){
            System.out.println("Cliente :"+(i+1));
            System.out.println(cliente[i].toString());
            System.out.println("---------------------");
        }
    }
    //metodo para mostrar saldo de un cliente
    public static void Mostrar_saldo (Cliente cliente []){
        int numero_cuenta ;
        int saldo ;
        boolean encontrado = false;
        //Ingresar al usuario que ingrese su numero de cuenta del cliente
        System.out.println("Ingresa el numero de cuenta para ubicar al cliente y mostrar sus datos");
        numero_cuenta = sc.nextInt();

        for(int i = 0; i<cliente.length;i++){
            if(numero_cuenta== cliente[i].getNumero_cuenta()){
                saldo = cliente[i].getSaldo();
                System.out.println(cliente[i].toString()+"\nSaldo:"+saldo);
                encontrado = true ;
                break;
            }
        }
        if (!encontrado){
            System.out.println("No hay un usuario con el numero de cuenta ingresado favor de verificar");
        }
    }

    //metodo para agregar saldo a un cliente
    public static void Agregar_saldo(Cliente cliente []){
        int numero_cuenta ;
        int saldo_adicion ,saldo_total;
        boolean encontrado = false;
        //Ingresar al usuario que ingrese su numero de cuenta del cliente
        System.out.println("Ingresa el numero de cuenta para ubicar al cliente y aumentar su saldo");
        numero_cuenta = sc.nextInt();
        for(int i = 0; i<cliente.length;i++){
            if(numero_cuenta== cliente[i].getNumero_cuenta()){
                encontrado = true ;
                System.out.println("Usuario encontrado porfavor digita cuanto saldo deseas agregar:");
                saldo_adicion = sc.nextInt();
                saldo_total = saldo_adicion + cliente[i].getSaldo();
                cliente[i].setSaldo(saldo_total);
                System.out.println("El nuevo saldo del cliente es :"+cliente[i].getSaldo());
                break;
            }

        }
        if(!encontrado){
            System.out.println("No hay un usuario con el numero de cuenta ingresado favor de verificar");
        }
    }
    public static void Sacar_dinero(Cliente cliente []){
        int numero_cuenta ;
        int saldo_retiro ,saldo_total;
        boolean encontrado = false ;
        System.out.println("Ingresa el numero de cuenta para ubicar al cliente y retirar su dinero ");
        numero_cuenta = sc.nextInt();
        for(int i = 0; i< cliente.length;i++){
            if(numero_cuenta== cliente[i].getNumero_cuenta()){
                encontrado = true ;
                System.out.println("Usuario encontrado porfavor digita cuanto saldo deseas retirar:");
                saldo_retiro = sc.nextInt();
                if(cliente[i].getSaldo()>=saldo_retiro){
                    saldo_total = cliente[i].getSaldo() - saldo_retiro;
                    cliente[i].setSaldo(saldo_total);
                    System.out.println("el nuevo saldo del cliente es :"+cliente[i].getSaldo());
                }else if(cliente[i].getSaldo()<saldo_retiro){
                    System.out.println("No hay saldo suficiente en la cuenta");
                }
                break;
            }
        }
        if(!encontrado){
            System.out.println("No hay un usuario con el numero de cuenta ingresado favor de verificar");
        }
    }
}
