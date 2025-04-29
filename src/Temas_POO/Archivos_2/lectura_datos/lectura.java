package Temas_POO.Archivos_2.lectura_datos;

import java.io.*;

public class lectura {
    //Declaramos la instancia
    File archivo ;
    //primero pues ya creamos el archivo anulamos los metodos y ahora inicializamos el consturctor
    public lectura(){
        archivo = new File("src/Temas_POO/Archivos_2/lectura_datos/segundoarchivo.txt") ;
    }
    public void crear_archivo() {
        archivo = new File("src/Temas_POO/Archivos_2/lectura_datos/segundoarchivo.txt");//ten en cuenta el problema de la ruta relativa
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

    public void leer_txt(){
        String cadena =" " ;
        try {
            FileReader lectura = new FileReader(archivo);
            BufferedReader almacenamiento = new BufferedReader(lectura);
            cadena = almacenamiento.readLine();
            while (cadena!=null){
                System.out.println(cadena);
                cadena = almacenamiento.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException"+ e);
        } catch (IOException e) {
            System.err.println("IOException e"+e);
        }

    }

    public static void main(String[] args) {
        lectura archivo = new lectura();
        //si quisiera no utilizar el metodo para la creacion tendria que inicializar el objeto de manera correcta ,lo haremos en el constructor
        /*archivo.crear_archivo();
        archivo.Escribir_txt_archivo();
        archivo.añadir_txt();*/
        archivo.leer_txt();


    }

}
