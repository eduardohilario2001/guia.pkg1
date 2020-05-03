package guia.pkg1;
import java.util.Scanner;
public class Tarea16 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    float c;
    float d;
    float e;
    float f;
    System.out.println("Ingrese horas trabajadas");
    float a=x.nextInt();
        System.out.println("Ingrese tarifa por hora");
    float b=x.nextInt();
     c=(float) (a*b);
     d=(float) (a/0.05+a);
     e=(float) (c+d);
     f=(float) (e/3.24);
        System.out.println("El sueldo es...." +c);
        System.out.println("El bono es...." +d);
        System.out.println("El total es...." +e);
        System.out.println("El total en $ es...." +f);
     
           
    }
    
}
