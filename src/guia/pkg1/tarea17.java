package guia.pkg1;
import java.util.Scanner;
public class tarea17 {
       public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
        int total;
        float n1;
        float n2;
        float n3;
     System.out.println("Numeros de aprobados:");
        int a=x.nextInt();
            System.out.println("Numeros de desaprobados:");
        int b=x.nextInt();
            System.out.println("Numeros de retirados:");
        int c=x.nextInt();
      total=a+b+c;
      n1=(float)(a*100/total);
      n2=(float)(b*100/total);
      n3=(float)(c*100/total);
           System.out.println("Aprobados: " +n1);
           System.out.println("Desaprobados: " +n2);
           System.out.println("Retirados: " +n3);
       }
}
