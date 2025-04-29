package Temas_POO.Try_catch;

public class Try_catch_No_ver {
    //Metodo para div entre 0
    public void division (){
        int numero = 1 ;
        int cero = 0 ;
        int resultado = numero/cero ;
        System.out.println(resultado);
    }
    public void llamado (){
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("No se puede la division entre 0 ");
        }
        System.out.println("Division entre 0 fallida ");
    }
    public static void main(String[] args) {
            Try_catch_No_ver obj = new Try_catch_No_ver();
            obj.llamado();
    }
}
