package Taller1;
import java.util.Scanner;

public class Propuesto21 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        triang t= new triang();
        System.out.println("Ingrese el lado 1 del triangulo");
        t.lado1= lea.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo");
        t.lado2= lea.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo");
        t.lado3= lea.nextDouble();
        System.out.println("El perimetro es: " + perimetro(t.lado1,t.lado2,t.lado3));
        double semiper= semiperimetro(t.lado1,t.lado2,t.lado3);
        System.out.println("El semiperimetro es: " + semiper);
        System.out.println("El area es: " + area(t.lado1,t.lado2,t.lado3,semiper));
    }
    public static double perimetro(double b1,double b2,double b3){
        return b1+b2+b3;
    }
    public static double semiperimetro(double b1,double b2,double b3){
        return (b1+b2+b3)/2;
    }
    public static double area(double a, double b,double c,double s ){
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    } 
}
class triang{
    double lado1;
    double lado2;
    double lado3;
}