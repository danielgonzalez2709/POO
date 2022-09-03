package Taller1;

import java.util.Scanner;


public class Resuelto12 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String NOM= lea.next();
        System.out.println("Ingrese las horas trabajadas");
        int NHT= lea.nextInt(), HET, HEE8;
        System.out.println("Ingrese el valor de la hora normal");
        double VHN=lea.nextDouble(), salario;
        if(NHT >40){
            HET= NHT - 40;
            if(HET>8){
                HEE8= HET-8;
                salario = 40*VHN + 16*VHN +HEE8*3*VHN;
            }else{
                salario = 40*VHN + HET*2*VHN; 
            }
        }else{
            salario = NHT*VHN;
        }
        System.out.println("El trabajor "+NOM+" devengó: $"+salario );
    }
}