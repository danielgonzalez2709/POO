package Taller1;
import java.util.Scanner;

public class Propuesto19 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        triangulo t= new triangulo();
        System.out.println("Ingrese el lado del triangulo");
        t.lado= lea.nextDouble();
        System.out.println("El perimetro es: " + perimetro(t.lado));
        System.out.println("La altura es: " + altura(t.lado));
        System.out.println("El area es: " + area(t.lado,altura(t.lado)));
    }
    public static double perimetro(double b){
        return b*3;
    }
    public static double altura(double b){
        return (Math.sqrt(3)*b)/2;
    }
    public static double area(double b, double h){
        return (h*b)/2;
    }
}
class triangulo{
    double lado;
}