package Ejercicios.Poligono;

public class Rectangulo extends Poligono {
    //atributos de el objeto rectangulo
    private int lado_1,lado_2;

    //metodo constructor del metodo rectangulo
    public Rectangulo(int num_lados,int lado_1,int lado_2){
        super(num_lados);
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }


    //metodo to string
    @Override
    public String toString() {
        return "Rectángulo:\n" + super.toString() +
                ", Base: " + lado_1 +
                ", Altura: " + lado_2 +
                ", Área: " + area();
    }

    //metodo para calcular el area
    public int area(){
        return (lado_1*lado_2);
    }

}
