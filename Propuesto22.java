package Taller1;

import java.util.Scanner;

public class Propuesto22 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre= lea.next();
        System.out.println("Ingrese su salario basico por horas: ");
        double salario= lea.nextDouble();
        System.out.println("Ingrese las horas trabajadas: ");
        int horas= lea.nextInt();
        System.out.print(nombre);
        if ((horas*salario)>450000){
            System.out.println("  "+salario);
        }
    }
}
