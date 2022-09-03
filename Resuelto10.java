package Taller1;

import java.util.Scanner;

public class Resuelto10 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese el número de inscripciones: ");
        int ni= lea.nextInt();
        System.out.print("Ingrese el nombre: ");
        String nom= lea.next();
        System.out.print("Ingrese el patrimonio: ");
        double pat= lea.nextDouble();
        System.out.print("Ingrese el estrato social: ");
        int es= lea.nextInt();
        double valorMat= 50000;
        if(pat>2000000 && es>3){
            valorMat+=(0.03*pat);
        } 
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+ ni+" Y NOMBRE "+nom+" DEBE PAGAR: $"+ valorMat);
    }
}
