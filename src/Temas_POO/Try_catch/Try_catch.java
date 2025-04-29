package Temas_POO.Try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_catch {
    //Metodo para leer un archivo
    //usamos la palabra reservada throws para declarar la excepcion que se puede generar
    //pero no se desea atrapar el error dentro del metodo
    public void leer_archivo( )throws FileNotFoundException {
        File archivo = new File("texto.txt");
        FileReader fr = new FileReader(archivo);
    }
    //Se puede usar a la clase padre o la super clase para declarar el error
    public void llamado_archivo() throws IOException {
        leer_archivo();
    }
    public static void main(String[] args) {
        //Las excepciones de la clase IOexception puede ser por que hubo alguna falla con el archivo
        //Las de run time  es porqe haces algo que no es correcto al ingresar datos division entre 0

    }
}
