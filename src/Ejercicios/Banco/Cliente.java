package Ejercicios.Banco;

public class Cliente {
    private String nombre ;
    private String apellido ;
    private int id ;
    private int saldo = 0  ;
    private String  numero_cuenta ;
    //constructor vacio para buenas practicas en el caso de que no se inialize de manera correcta el constructuro
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int id, int saldo, String numero_cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    //metodo to string
    public String toString(){
        return "nombre :"+getNombre()+"apellido :"+getApellido()+"id:"+getId()+"Salgo_actual :"+getSaldo()+"Numero_cuenta :"+getNumero_cuenta();
    }
}
