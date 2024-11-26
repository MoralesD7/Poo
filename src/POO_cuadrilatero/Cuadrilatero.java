package POO_cuadrilatero;
/*
Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
Los valores de la longitud deberán introducirse por línea de comandos.
*/
public class Cuadrilatero {
    private int lado_uno;
    private int lado_dos;
    private int perimetro ;
    private int area ;

    public Cuadrilatero(int lado_uno, int lado_dos) {
        this.lado_uno = lado_uno;
        this.lado_dos = lado_dos;
    }

    public int getPerimetro() {
        perimetro = lado_uno+lado_dos;
        return perimetro;
    }


    public int getArea() {
        area = lado_uno*lado_dos;
        return area;
    }

}
