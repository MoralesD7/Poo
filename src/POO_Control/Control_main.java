package POO_Control;

import com.sun.tools.javac.Main;

import javax.swing.*;


public class Control_main {
    public static void main(String[] args) {
        //creacion de la variable mov
        String mov;
        String mov_real ="";
        //creacion de acumulador de posiciones tanto para x como para y
        int x = 0 ;
        int y = 0 ;
        //mensajito de bienvenida
        JOptionPane.showMessageDialog(null,
                "Hello bienvenido a tu sistema de coordenadas \n"+
                "Digita porfavor hacia donde quieres moverte:\n"+
                "Si deseas salir del programa digita salir wuiiiii");

        do{
            //Obtener la cadena y pasarla a minuscula
            mov =  JOptionPane.showInputDialog("Hacia donde quieres ir :\n"+
                    "derecha , izquierda , arriba , abajo ");
            mov_real = mov.toLowerCase();

            //creacion del obj
            Control palanca = new Control(mov_real);
            if(mov_real.equals("derecha") || mov_real.equals("izquierda")){
                x += palanca.get_x();
                JOptionPane.showMessageDialog(null,
                        "La posicion en la que te encuentras es :"+"("+x+" , "+y+")");
            }else if (mov_real.equals("arriba") || mov_real.equals("abajo")){
                y += palanca.get_y();
                JOptionPane.showMessageDialog(null,
                        "La posicion en la que te encuentras es :"+"("+x+" , "+y+")");
            }else if (!mov_real.equals("salir")){
                JOptionPane.showMessageDialog(null,"Anota una posicion valida");
            }
        }while(!mov_real.equals("salir"));
        if(mov_real.equals("salir")){
            JOptionPane.showMessageDialog(null,"Saliste de mi programita wuii");
        }

    }
}
