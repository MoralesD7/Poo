package POO_principios;
/*
* creacion de metodos e invocacion de ellos aplicados  a una calculadora
*/
import javax.swing.*;

public class Operacion {
    int n_1;
    int n_2;
    int suma;
    int resta;
    int mul;
    int division;

    public void Mostrar_info() {
        JOptionPane.showMessageDialog(null,
                "Buenas tardes este programa realizara las 4 operaciones basicas ");
    }
    public void Obtener_numeros() {
        n_1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer   numero :"));
        n_2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero "));
    }
    public void suma (){
        suma = n_1+n_2;
    }
    public void resta(){
        resta = n_1-n_2;
    }
    public void mul(){
        mul = n_1*n_2;
    }
    public void division(){
        division = n_1/n_2;
    }
    public void mostrar_resultados(){
        JOptionPane.showMessageDialog(null,"La suma dio "+suma);
        JOptionPane.showMessageDialog(null,"La resta dio "+resta);
        JOptionPane.showMessageDialog(null,"La multiplicacion dio "+mul);
        JOptionPane.showMessageDialog(null,"La division dio "+division);

    }

    public static void main(String[] args) {
        //creacion del objeto
        Operacion obj_1 = new Operacion();
        //mostrar info
        obj_1.Mostrar_info();
        //obtener la operacion
        obj_1.Obtener_numeros();
        obj_1.suma();
        obj_1.resta();
        obj_1.mul();
        obj_1.division();
        obj_1.mostrar_resultados();
    }
}
