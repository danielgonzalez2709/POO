package Taller1;

import java.util.Scanner;

public class Propuesto24 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        double a= lea.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        double b= lea.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        double c= lea.nextDouble();
        if(a>b && a>c){
            System.out.println("La esfera con el mayor pero es la A "+a);
        }else if(b>c){
            System.out.println("La esfera con el mayor pero es la B "+b);
        }else{
            System.out.println("La esfera con el mayor pero es la C "+c);
        }
    }
} 
