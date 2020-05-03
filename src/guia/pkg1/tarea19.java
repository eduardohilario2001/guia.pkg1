package guia.pkg1;
import java.util.Scanner;
public class tarea19 {
     public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     int total;       
     System.out.println("Ingrese cateto 1:");
        int a=x.nextInt();
            System.out.println("Ingrese cateto 2:");
        int b=x.nextInt(); 
      int hipotenusa = (int) Math.sqrt((a*a)+(b*b));
       total=a+b+hipotenusa;
            System.out.println("El perimetro del triangulo es: " +total);
     }   
}
