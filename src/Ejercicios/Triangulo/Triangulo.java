package Ejercicios.Triangulo;

public class Triangulo {
    private int lad;
    private int base;
    private int perimetro;
    private int area;

    public Triangulo(int lad, int base) {
        this.lad = lad;
        this.base = base;
    }

    public int getPerimetro() {
        perimetro = (lad * 2) + base;
        return perimetro;
    }

    public int getArea() {
        area = (lad * base) / 2;  // Cálculo correcto del área del triángulo
        return area;
    }

    public void mostrarDatos() {
        System.out.println("Lado: " + lad + ", Base: " + base + ", Perímetro: " + getPerimetro() + ", Área: " + getArea());
    }
}
