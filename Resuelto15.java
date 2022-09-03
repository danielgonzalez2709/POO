package Taller1;

import java.util.Scanner;

public class Resuelto15 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        double a= lea.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        double b= lea.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        double c= lea.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        double d= lea.nextDouble();
        if(a==b && a==c){
            System.out.println("LA ESFERA D ES LA DIFERENTE Y");
            if(d>a){
                System.out.println("ES DE MAYOR PESO");
            }else{
                System.out.println("ES DE MENOR PESO");
            }
        }else if(a==b && a==d){
            System.out.println("LA ESFERA C ES LA DIFERENTE Y");
            if(c>a){
                System.out.println("ES DE MAYOR PESO");
            }else{
                System.out.println("ES DE MENOR PESO");
            }
        }
        else if(a==c && a==d){
            System.out.println("LA ESFERA B ES LA DIFERENTE Y");
            if(b>a){
                System.out.println("ES DE MAYOR PESO");
            }else{
                System.out.println("ES DE MENOR PESO");
            }
        }else{
            System.out.println("LA ESFERA A ES LA DIFERENTE Y");
            if(a>b){
                System.out.println("ES DE MAYOR PESO");
            }else{
                System.out.println("ES DE MENOR PESO");
            }
        }
    }
}
