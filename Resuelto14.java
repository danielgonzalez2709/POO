package Taller1;

import java.util.Scanner;


public class Resuelto14 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ventas del departamento 1: ");
        double v1= lea.nextDouble();
        System.out.println("Ventas del departamento 2: ");
        double v2= lea.nextDouble();
        System.out.println("Ventas del departamento 3: ");
        double v3= lea.nextDouble();
        System.out.println("Salario de los empleados: ");
        double salario= lea.nextDouble();
        double porcentaje= 0.33*(v1+v2+v3);
        System.out.println("SALARIO VENDEDORES DEPTO. 1 "+salar(salario,v1,porcentaje));
        System.out.println("SALARIO VENDEDORES DEPTO. 2 "+salar(salario,v2,porcentaje));
        System.out.println("SALARIO VENDEDORES DEPTO. 3 "+salar(salario,v3,porcentaje));
    }
    public static double salar(double salario, double v, double porcent){
        if (v>porcent){
            return (salario+0.2*salario);
        }
        return salario;        
    }
}
