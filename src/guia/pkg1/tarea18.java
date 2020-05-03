package guia.pkg1;
import java.util.Scanner;
public class tarea18 {
        public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     float area;      
            System.out.println("Ingrese base del triangulo");
        int a=x.nextInt();
            System.out.println("Ingrese altura del triangulo");
        int b=x.nextInt();
        area=(a*b)/2;
            System.out.println("El area del triangulo es: " +area);
        }
}
