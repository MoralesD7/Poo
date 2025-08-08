package Temas_POO.Listas;

import java.util.Scanner;
import java.util.Stack;

public class Stack_pila {
    //las pilas se definen por el principio lifo
    //sintaxis basica :
    public static void main(String[] args) {
        int contador = 0;
        String numero= "" ;
        Stack<String> books = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (contador!=5) {
            System.out.println("Digita valores de entrada plebeyo para que asi llenes mi stack y veas su funcionamiento wuiiiii");
            numero = sc.nextLine();
            books.push(numero);
            contador++;

        }
        System.out.println("ahora te eliminare tu ultimo elemento:");
        books.pop();

        if(books.isEmpty()){
            System.out.println("no hay elementos en la pila ");
            try {
                System.out.println("que elemento imprimira si no tiene nada :"+books.peek());
            }catch (RuntimeException e ){
                System.err.println("basicamente el error te dice que no hay elementos en la pila"+e);
            }
        }else{
            for(String libro : books ){
                System.out.println(libro);
            }
        }


    }
}
