package Temas_POO.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class prueba_2 {
    //Declaramos la instancia
    File archivo ;
    File directorio;
    public void crear_archivo() {
        archivo = new File("src/Temas_POO/archivos/miprimerarchivo.txt");//ten en cuenta el problema de la ruta relativa
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Ocurrió un error al intentar crear el archivo.");
        }
    }
    public void crear_directorio(){
        directorio = new File("src/Temas_POO/archivos/miprimerdirectorio");
        if(directorio.mkdirs()){
            System.out.println("El directorio se creo existosamente ");
        }else{
            System.out.println("Ya hay un directorio creado con ese nombre ");
        }
    }
    public void Escribir_txt_archivo(){
        try {
            FileWriter txt = new FileWriter(archivo);
            txt.write("Hola mundo sobre mi primer archivo wuiii ");
            txt.write("\r\nMas texto");
            txt.close();
        } catch (IOException e) {
            System.err.println("no se pudo escribir sobre tu archivo");
        }
    }
    public void añadir_txt(){
        try {
            FileWriter txt = new FileWriter(archivo,true);
            txt.write("\r\nprueba de que cree mas texto ");
            txt.close();
        } catch (IOException e) {
            System.err.println("No se pudo añadir mas texto ");
        }
    }

    public static void main(String[] args) {
        prueba_2 archivo = new prueba_2();
        //si quisiera no utilizar el metodo para la creacion tendria que inicializar el objeto de manera correcta , ya sea en el metodo o en el constructor 
        archivo.crear_archivo();
/*
        archivo.Escribir_txt_archivo();
*/
        archivo.añadir_txt();
        /*prueba_2 directorio = new prueba_2();
        directorio.crear_directorio();*/

    }


}
