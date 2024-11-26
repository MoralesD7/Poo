package Calculo_complejos;

public class Numeros {
    //en este caso lo haremos para binomios
    private int n_real,n_imaginario ;

    //construimos el constructor
    public Numeros (int n_real,int n_imaginario){
        this.n_real = n_real;
        this.n_imaginario = n_imaginario;
    }
    //metodos get para obtener los valores de los arreglos de objetos
    public int getN_real(){
        return n_real;
    }
    public int getN_imaginario(){
        return n_imaginario;
    }



}
