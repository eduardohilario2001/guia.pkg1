package guia.pkg1;
import java.util.Scanner;
public class tarea24 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        System.out.println("Ingrese el primer monto");
    int a=x.nextInt();
        System.out.println("Ingrese el segundo monto");
    int b=x.nextInt();
        System.out.println("Ingrese el tercer monto");
    int c=x.nextInt();
    n1=(float) (a/5+b*1.2);
    n2=(float) (1.6*c/2);
    n3=a+b+c/8;
        System.out.println("Primera condicion es: " +n1);
        System.out.println("Segunda condicion es: " +n2);
        System.out.println("Tercera condicion es: " +n3);
    }
    
}
