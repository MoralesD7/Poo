package Temas_POO.gate_pruebas;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Materia {
    String nom_materia ;
    LocalTime hora_i ;
    LocalTime hora_f ;

    public Materia(String nom_materia, LocalTime hora_i, LocalTime hora_f) {
        this.nom_materia = nom_materia;
        this.hora_i = hora_i;
        this.hora_f = hora_f;
    }

    public String getNom_materia() {
        return nom_materia;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public LocalTime getHora_i() {
        return hora_i;
    }

    public void setHora_i(LocalTime hora_i) {
        this.hora_i = hora_i;
    }

    public LocalTime getHora_f() {
        return hora_f;
    }

    public void setHora_f(LocalTime hora_f) {
        this.hora_f = hora_f;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "nom_materia='" + nom_materia + '\'' +
                ", hora_i=" + hora_i +
                ", hora_f=" + hora_f +
                '}';
    }
    //puesto
    static boolean validar_hora_d_materia(Materia materia) {
        // apply compareTo()
        int determinador_hora = materia.hora_i.compareTo(materia.hora_f);
        if (determinador_hora > 0 ||determinador_hora == 0) {
            //return "La materia : " + nom_materia + "tiene un intervalo inconsistente en cuanto a su hora inicial y final";
            return false;
        }else {
            //return "El horario es valida";
            return true ;
        }
    }
    public static void main(String[] args) {
        //boolean validado ;
        String nombre ;
        int hora_i,hora_f,min_i,min_f,k= 0 ;
        LocalTime hora_inicial,hora_final ;
        Scanner sc = new Scanner(System.in);
        //Lista de materias
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Materia> materias_traslapadas = new ArrayList<>();



        for (int i = 0  ; i < 3 ; i++) {
            //solicitar datos
            System.out.println("nombre de la materia :");
            nombre = sc.nextLine();

            System.out.println("hora y min iniciales de tu materia :");
            hora_i = sc.nextInt();
            min_i = sc.nextInt();

            System.out.println("hora y min finales de la materia :");
            hora_f = sc.nextInt();
            min_f = sc.nextInt();

            sc.nextLine();

            hora_inicial = LocalTime.of(hora_i,min_i);
            hora_final = LocalTime.of(hora_f,min_f);
            Materia materia = new Materia(nombre,hora_inicial,hora_final);
            //validacion para que no inserte materias con hor_i y hor_f de manera inconsistente
            if (validar_hora_d_materia(materia)){
                materias.add(materia);
            }else{
                System.out.println("la materia "+materia.nom_materia+" me rompe las pelotas y la anotaste mal checa los intervalos");
            }

        }
        System.out.println("materias en desorden");
        for (Materia m: materias ){
            System.out.println(m);
        }
        for (int i = 0 ; i<materias.size()-1;i++){
            Materia materia_actual = materias.get(i);
            for (int j = 0 ; j<materias.size();j++){
                Materia materia_siguiente = materias.get(j);
                if(i==j)continue;
                if (materia_actual.hora_f.compareTo(materia_siguiente.hora_i) <= 0
                        ||
                        materia_actual.hora_i.compareTo(materia_siguiente.hora_f) >= 0){
                    //mas facil señalar los casos donde no hay traslape ya que todos los demas son considerasdos traslape

                }else{
                    if(!materias_traslapadas.contains(materia_actual)){
                        materias_traslapadas.add(materia_actual);
                    }

                }

            }
        }

        System.out.println("materias que estan traslapadas");
        for (Materia m : materias_traslapadas){
            System.out.println(m);
        }


            System.out.println("-------------------------------------------");
            for (int i = 0; i <materias.size()-1;i++){
                for (int j = 0 ; j< materias.size()-1;j++){
                    Materia materia_actual = materias.get(j);
                    Materia materia_siguiente = materias.get(j+1);
                    //no se que hacer llamen a la policia
                    if (materia_actual.hora_i.compareTo(materia_siguiente.hora_f) >= 0) {
                        Materia obj_aux = materia_siguiente;
                        materias.set(j+1,materia_actual);
                        materias.set(j,obj_aux);
                    }
                }
            }
            System.out.println("materias validas y orden correcto :");
            for (Materia m : materias){
                System.out.println(m);
            }




    }
}
