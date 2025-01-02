package Temas_POO.interface_tema;
//las interfaces sirven para poder simular la herencia multiple en java , ya que como tal no estan en el lenguage
public class Musico_estudiante implements Musico,Estudiante{
    @Override
    public void hablar(){
        System.out.println("yo hablo en español");
    }
    @Override
    public void tocar_musica(){
        System.out.println("toco el piano ");
    }
    @Override
    public void escribir(){
        System.out.println("Escribo con las manos padre ");
    }

    public static void main(String[] args) {

        //instanciacion del obj
        Musico_estudiante musiquito = new Musico_estudiante();

        musiquito.hablar();
        musiquito.escribir();
        musiquito.tocar_musica();
    }
}
