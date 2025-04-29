package Temas_POO.archivos;

import java.io.File;

public class class_file {
    public static void main(String[] args) {
        //teniendo en cuenta que no hay constructores vacios :
        //hay dos tipos de ruta :absotula y relativa , la absoluta es esta:/Users/omaralejandromoralesdiaz/Desktop/Poo/src/Temas_POO/archivos/prueba_1.txt
        //intelijei asume una ruta que no es , por eso la acompleto como ruta relativa
        File archivo = new File("src/Temas_POO/archivos/prueba_1.txt");

        //usando algunos de los metodos de la clase file:
        if(archivo.exists()){
            System.out.println("El archivo existe");
            System.out.println("¿El archivo si es un archivo?"+archivo.isFile());
            System.out.println("Ruta del archivo "+ archivo.getAbsolutePath());
            System.out.println("¿Se puede leer ?"+archivo.canRead());
        }else{
            System.out.println("El archivo no existe ");
        }
        //basicamente es lo mismo con el directorio a excepcion de que la ruta es distinta por que no es un archivo si  no una carpeta obvio
        File directorio = new File("src/Temas_POO/archivos/directorio_minino");

        //usando algunos de los metodos de la clase file:
        if(directorio.exists()){
            System.out.println("El directorio existe");
            System.out.println("¿El directorio si es un directorio?"+directorio.isDirectory());
            System.out.println("Ruta del directorio "+ directorio.getAbsolutePath());
            System.out.println("¿Se puede leer ?"+directorio.canRead());
        }else{
            System.out.println("El archivo no existe ");
        }
    }
}
