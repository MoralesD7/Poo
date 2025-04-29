package Ejercicios.Dados;

import java.util.Random;

public class Dado {
    //Necesito crear una instancia para sacar un numero aleatorio
    Random aleatorio = new Random();
    //Atributos
    private int valor = aleatorio.nextInt(6+1);
    //constructor
    public Dado(){
    }

    public int getValor(){
        return valor;
    }

}
