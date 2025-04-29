package Temas_POO.Try_catch;
//Excepciones verificadas

import javax.swing.*;
import java.io.*;

public class Try_catch_verificadas {
    public void leer_archivo() throws IOException{
        File archivo = new File("/Users/omaralejandromoralesdiaz/Desktop/Poo/src/Temas_POO/Try_catch/Hola_mundo.txt");
        FileReader lectura  = new FileReader(archivo);
        BufferedReader almacenador = new BufferedReader(lectura);
        String linea ;
        while ((linea = almacenador.readLine()) != null){
            System.out.println(linea);
        }
    }
    public void leer_archivo_try(){
        try {
            leer_archivo();
        } catch (FileNotFoundException FNFE){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo deseado ");
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido algo inesperado");
        }finally {
            System.out.println("Programa terminado");
        }
    }
    public static void main(String[] args) {
        Try_catch_verificadas obj = new Try_catch_verificadas();
        obj.leer_archivo_try();
    }
}
