package Taller1;

import java.util.Scanner;

public class Resuelto7 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingerese el valor de A: ");
        double a= lea.nextDouble();
        System.out.println("Ingerese el valor de B: ");
        double b= lea.nextDouble();
        if (a>b){
            System.out.println("A es mayor que B");
        }else if(a<b){
            System.out.println("A es menor que B");
        }else{
            System.out.println("A es igual que B");
        }
        
    }
}

