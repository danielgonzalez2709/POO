package Taller1;
import java.util.Scanner;

public class Resuelto11 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int a= lea.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int b= lea.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int c= lea.nextInt();
        if (mayor(a,b,c)){
            System.out.println("El mayor es A: "+a);
        }else if (mayor(b,a,c)){
            System.out.println("El mayor es B: "+b);
        }else{
            System.out.println("El mayor es C: "+c);
        }
    }
    
    public static boolean mayor(int a, int b, int c){
        if(a>b && a>c){
            return true;
        }
        return false;
    }
}