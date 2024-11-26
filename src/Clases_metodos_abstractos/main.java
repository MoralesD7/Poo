package Clases_metodos_abstractos;

public class main {
    public static void main(String[] args) {
        //creacion de objetos
        Planta plantita = new Planta();
        Animal_carnivoro dinosaurio = new Animal_carnivoro();

        plantita.alimentarse();
        dinosaurio.alimentarse();
    }
}
