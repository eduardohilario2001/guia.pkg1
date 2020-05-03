package guia.pkg1;
import java.util.Scanner;
public class tarea4 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     int suma;
     int division;
     int resta;
     int producto;
     int residuo;
     System.out.println("Ingrese primer numero");
    int a=x.nextInt();
    System.out.println("Ingrese segundo numero");
    int b=x.nextInt();
    suma=a+b;
    division=a/b;
    resta=a-b;
    producto=a*b;
    residuo=a%b;
        System.out.println("Suma" +suma);
        System.out.println("Resta" +resta);
        System.out.println("Division" +division);
        System.out.println("Producto" +producto);
        System.out.println("Residuo" +residuo);
    }   
}
