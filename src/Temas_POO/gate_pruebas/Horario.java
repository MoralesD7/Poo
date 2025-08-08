package Temas_POO.gate_pruebas;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Horario {
    List<Dia> dias ;
    public Horario(){}

    public Horario(List<Dia> dias) {
        this.dias = dias;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "dias=" + dias +
                '}';
    }

    static class Dia {
        String nombre_dia;
        List<Materia> materias ;
        public Dia(){}
        public Dia(String nombre_dia, List<Materia> materias) {
            this.nombre_dia = nombre_dia;
            this.materias = materias;
        }

        public String getNombre_dia() {
            return nombre_dia;
        }

        public void setNombre_dia(String nombre_dia) {
            this.nombre_dia = nombre_dia;
        }

        public List<Materia> getMaterias() {
            return materias;
        }

        public void setMaterias(List<Materia> materias) {
            this.materias = materias;
        }

        @Override
        public String toString() {
            return "Dia{" +
                    "nombre_dia='" + nombre_dia + '\'' +
                    ", materias=" + materias +
                    '}';
        }

        static class Materia {
            String nombre_materia;
            Time hor_inicial;
            Time hor_final;
            String nombre_salon;
            public Materia(){}
            public Materia(String nombre_materia, Time hor_inicial, Time hor_final, String nombre_salon) {
                this.nombre_materia = nombre_materia;
                this.hor_inicial = hor_inicial;
                this.hor_final = hor_final;
                this.nombre_salon = nombre_salon;
            }

            public String getNombre_materia() {
                return nombre_materia;
            }

            public void setNombre_materia(String nombre_materia) {
                this.nombre_materia = nombre_materia;
            }

            public Time getHor_inicial() {
                return hor_inicial;
            }

            public void setHor_inicial(Time hor_inicial) {
                this.hor_inicial = hor_inicial;
            }

            public Time getHor_final() {
                return hor_final;
            }

            public void setHor_final(Time hor_final) {
                this.hor_final = hor_final;
            }

            public String getNombre_salon() {
                return nombre_salon;
            }

            public void setNombre_salon(String nombre_salon) {
                this.nombre_salon = nombre_salon;
            }

            @Override
            public String toString() {
                return "Materia{" +
                        "nombre_materia='" + nombre_materia + '\'' +
                        ", hor_inicial=" + hor_inicial +
                        ", hor_final=" + hor_final +
                        ", nombre_salon='" + nombre_salon + '\'' +
                        '}';
            }
        }
    }

    public static void main(String[] args) {
        //creo una materia
        Dia.Materia obj_materia = new Dia.Materia("fisica",new Time(1,30,0),new Time(2,30,0),"basicas");
        //creo una lista de un dia
        ArrayList<Dia.Materia> lista_materias = new ArrayList<>();
        lista_materias.add(obj_materia);
        //creo un objeto del dia
        Dia obj_dia = new Dia("lunes",lista_materias);
        List<Dia> obj_dias = new ArrayList<>();
        obj_dias.add(obj_dia);
        Horario horario = new Horario(obj_dias);
        System.out.println(horario);

    }
}
