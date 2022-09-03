package Taller1;

import java.util.Scanner;

public class Propuesto23 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        double a= lea.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double b= lea.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double c= lea.nextDouble();
        double raiz= Math.sqrt(Math.pow(b, 2)-4*a*c);
        double ec1= (-b + raiz)/(2*a);
        double ec2= (-b - raiz)/(2*a);
        if(2*a!=0 && raiz>0){
            System.out.println("La primera solución es: "+ec1);
            System.out.println("La segunda solución es: "+ec2);
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
