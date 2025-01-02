package Ejercicios.Cajero;

public class Cliente {
    //atributos
    private String nombre ;
    private String apellido ;
    private int numero_cuenta;
    private int saldo;

    //inicializacion del constructor

    //Sobrecarga del constructor
    public Cliente(String nombre, String apellido, int numero_cuenta, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    //Generacion de getters y un setter para poder manejar el saldo de manera correcta

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //generacion de metodo to string para recibir mostrar la informacion de cada cliente
    @Override
    public String toString() {
        return
                "Nombre :" + nombre +
                "\nApellido :" + apellido +
                "\nNumero_cuenta:" + numero_cuenta;
    }
}
