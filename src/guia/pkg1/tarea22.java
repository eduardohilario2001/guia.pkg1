package guia.pkg1;
import java.util.Scanner;
public class tarea22 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
    float n1;
    float n2;
    float n3;
    int total;
        System.out.println("Ingrese su nombre");
    String d=x.next();
        System.out.println("Nota 1");
    int a=x.nextInt();
        System.out.println("Nota 2");
    int b=x.nextInt();
        System.out.println("Nota 3");
    int c=x.nextInt();
    n1=(float) (a*0.20);
    n2=(float) (b*0.30);
    n3=(float) (c*0.50);
    total=(int) (n1+n2+n3);
        System.out.println("El promedio es: " +total);
    }
    
}
