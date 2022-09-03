package Taller1;

import java.util.Scanner;

public class Propuesto18 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        empleado n1 = new empleado();
        System.out.println("Ingrese el codigo");
        n1.codigo= lea.nextInt();
        System.out.println("Ingrese el nombre");
        n1.nombres= lea.next();
        System.out.println("Ingrese las horas trabajadas");
        n1.horasTrabajadas= lea.nextDouble();
        System.out.println("Ingrese el valor de la hora");
        n1.valorHora= lea.nextDouble();
        System.out.println("Ingrese el porcentaje de retención");
        n1.retencion= lea.nextDouble();
        System.out.println("Codigo: "+n1.codigo+"\t Nombres: "+n1.nombres);
        double salBruto=n1.horasTrabajadas*n1.valorHora;
        System.out.println("Salario bruto: "+salBruto);
        double salNeto=salBruto-((n1.retencion/100)*salBruto);
        System.out.println("Salario neto: "+salNeto);
    }
}

class empleado{
    int codigo;
    String nombres;
    double horasTrabajadas;
    double valorHora;
    double retencion;
}
