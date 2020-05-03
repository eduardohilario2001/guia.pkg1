package guia.pkg1;
import java.util.Scanner;
public class tarea23 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
       float n1;
       float n2;
       float n3;       
       float n4;       
               
        System.out.println("Ingrese su nombre del producto");
    String a=x.next();
        System.out.println("Ingrese precio");
    int b=x.nextInt();
        System.out.println("Ingrese cantidad");
    int c=x.nextInt();
    n1=b*c;
    n2=(float) (n1*0.18);
    n3=(float) (n1*0.03);
    n4=n1-n2+n3;
        System.out.println("Nombre del producto" +a);
        System.out.println("Importe: " +n1);
        System.out.println("IGV: " +n2);
        System.out.println("Descuento: " +n3);
        System.out.println("Total: " +n4);
    
    }
    
}
