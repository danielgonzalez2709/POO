package Taller1;

import java.util.Scanner;


public class Resuelto13 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingerese el valor de la cuenta: ");
        double vcompra= lea.nextDouble(), porcent;
        System.out.println("Inrese el color de la bolita: ");
        String color= lea.next();
        if (color.equalsIgnoreCase("BLANCA")){
            porcent= 0;
        }else if(color.equalsIgnoreCase("VERDE")){
            porcent= 0.1;
        }else if(color.equalsIgnoreCase("AMARILLA")){
            porcent= 0.25;
        }else if(color.equalsIgnoreCase("AZUL")){
            porcent= 0.5;
        }else{
            porcent= 1;
        }
        System.out.println("El valor a pagar es: "+(vcompra-porcent*vcompra));
    }
}
