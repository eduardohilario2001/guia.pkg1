package guia.pkg1;
import java.util.Scanner;
public class tarea9 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     System.out.println("Ingrese lado 1:");
    int e;
     int a=x.nextInt();
    System.out.println("Ingrese lado 2:");
    int b=x.nextInt();
    e=a*2+b*2;
        System.out.println("Area del rectangulo: " +a*b);
        System.out.println("Perimetro: " +e);
    }
}
