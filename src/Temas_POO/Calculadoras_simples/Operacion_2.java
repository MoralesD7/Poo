package Temas_POO.Calculadoras_simples;
/*
 * creacion de metodos e invocacion de ellos aplicados  a una calculadora con parametros en los metodos
 */

import javax.swing.*;

public class Operacion_2 {
    int suma;
    int resta;
    int mul;
    int division;

    public void Mostrar_info() {
        JOptionPane.showMessageDialog(null,
                "Buenas tardes este programa realizara las 4 operaciones basicas ");
    }



    public void suma(int n_1, int n_2) {
        suma = n_1 + n_2;
    }

    public void resta(int n_1, int n_2) {
        resta = n_1 - n_2;
    }

    public void mul(int n_1, int n_2) {
        mul = n_1 * n_2;
    }

    public void division(int n_1, int n_2) {
        division = n_1 / n_2;
    }

    public void mostrar_resultados() {
        JOptionPane.showMessageDialog(null, "La suma dio " + suma);
        JOptionPane.showMessageDialog(null, "La resta dio " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion dio " + mul);
        JOptionPane.showMessageDialog(null, "La division dio " + division);

    }

    public static void main(String[] args) {
        //creacion del objeto
        Operacion_2 obj_1 = new Operacion_2();
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
        obj_1.mostrar_resultados();
    }
}
