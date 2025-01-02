package Temas_POO.getters_setters_primer_ejemplo;

public class Persona_llamado {
    public static void main(String[] args) {
        //para el primer objeto pues pondremos el uso de los metodos
        Persona_Encapsulamiento persona = new Persona_Encapsulamiento();
        persona.setNombre("Omar");
        persona.setEdad(18);

        //se imprimen los datos de manera manual
        System.out.println("El nombre de la primer persona es :"+persona.getNombre()+"y su edad es :"+persona.getEdad());

        //se creara un segundo objeto donde se inicializara desde el objetos sus atributos
        Persona_Encapsulamiento persona_2 = new Persona_Encapsulamiento("Santiago",20);

        //y despues simplemente se llamara al objeto con su respectivo metodo
        System.out.println(persona_2.toString());
    }
}
