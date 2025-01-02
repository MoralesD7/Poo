package Ejercicios.Poligono;

public class Triangulo_isoceles extends Poligono {
    //atributos de el objeto rectangulo
    private int lado_1,lado_2,lado_3;
    //metodo constructor del metodo rectangulo
    public Triangulo_isoceles(int num_lados,int lado_1,int lado_2,int lado_3){
        super(num_lados);
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
    }
    @Override
    public String toString() {
        return "Triángulo Isósceles: \n" + super.toString() +
                ", Base: " + lado_1 +
                ", Lado 1: " + lado_2 +
                ", Lado 2: " + lado_3 +
                ", Área: " + area();
    }

    //metodo para calcular el area
    public int area(){
        return (lado_1*lado_2)/2;
    }
}
