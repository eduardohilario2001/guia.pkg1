package guia.pkg1;
import java.util.Scanner;
public class tarea5 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     float r1;
     float r2;
     float r3;
        System.out.println("Ingrese primer numero");
    int a=x.nextInt();
        System.out.println("Ingrese segundo numero");
    int b=x.nextInt();
    r1=((a+b)/2);
    r2=(int) (a*1.2);
    r3=(int) (b*1.3);
        System.out.println("Resultado 1:" +r1);
        System.out.println("Resultado 2:" +r2);
        System.out.println("Resultado 3:" +r3);
    
    
    }
}
