package guia.pkg1;
//desarrollado por jesus Hilario
import java.util.Scanner;
public class tarea15 {
    public static void main(String[] args) {
          Scanner x=new Scanner(System.in);
    float c;
    float d;
    float e;
          System.out.println("Ingrese cantidad");
    float a=x.nextInt();
          System.out.println("Ingrese precio");
    float b=x.nextInt();
    
   c=a*b;
   d=(float) (c/3.24);
   e=(float)(c/3.75);
        System.out.println("El resultado es");
        System.out.println("Importe en S/...."+ c);
        System.out.println("Importe en $...."+ d);
        System.out.println("Importe en Euros...."+ e);
    
    }
    
}
