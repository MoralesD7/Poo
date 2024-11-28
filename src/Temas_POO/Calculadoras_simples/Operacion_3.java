package Temas_POO.Calculadoras_simples;
/*
 * creacion de metodos e invocacion de ellos aplicados  a una calculadora con parametros en los metodos
 * la dif cuando tiene el return es que puedes volver a reutilizar los valores que devuelva el metodo
 */
import javax.swing.*;

public class Operacion_3 {
    int suma;
    int resta;
    int mul;
    int division;

    public void Mostrar_info() {
        JOptionPane.showMessageDialog(null,
                "Buenas tardes este programa realizara las 4 operaciones basicas ");
    }

    public int suma(int n_1, int n_2) {
        suma = n_1 + n_2;
        return  suma ;
    }

    public int resta(int n_1, int n_2) {
        resta = n_1 - n_2;
        return resta ;
    }

    public int  mul(int n_1, int n_2) {
        mul = n_1 * n_2;
        return mul;
    }

    public int division(int n_1, int n_2) {
        division = n_1 / n_2;
        return division;
    }
    public static void main(String[] args) {
        //creacion del objeto
        Operacion_3 obj_1 = new Operacion_3();
        //mostrar info
        obj_1.Mostrar_info();
        //obtener los valores de los parametros
        int num_1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1 :"));
        int num_2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1 :"));
        //obtener la operacion
        obj_1.suma(num_1, num_2);
        obj_1.resta(num_1, num_2);
        obj_1.mul(num_1, num_2);
        obj_1.division(num_1, num_2);
        //en este caso se los agrego imprimo directamente los resultados pero puedo atribuirlos a una variable tmb
        System.out.println("El resultado de la suma fue :" +obj_1.suma);
        System.out.println("El resultado de la resta fue :" +obj_1.resta);
        System.out.println("El resultado de la multiplicacion fue :" +obj_1.mul);
        System.out.println("El resultado de la division fue :" +obj_1.division);

    }
}

