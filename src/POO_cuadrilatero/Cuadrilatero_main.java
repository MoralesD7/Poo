package POO_cuadrilatero;


import java.util.Scanner;

public class Cuadrilatero_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado_1,lado_2;
        System.out.println("Digita los lados de tu cuadrilatero :");
        lado_1= sc.nextInt();
        lado_2=sc.nextInt();
        Cuadrilatero obj = new Cuadrilatero(lado_1,lado_2);

        obj.getPerimetro();
        obj.getArea();
        System.out.println("El perimetro es :"+obj.getPerimetro());
        System.out.println("El area es :"+obj.getArea());
    }
}
