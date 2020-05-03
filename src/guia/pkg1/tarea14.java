package guia.pkg1;
import java.util.Scanner;
public class tarea14 {
        public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
      int b=0;      
     System.out.println("Ingrese un numero mayor a 0: ");
    int a=x.nextInt();
    
            if (a>0) {
                for (int i = 1; i <=a; i++) {
                 b=b+i; 
                }
                System.out.println("El valor total es: " +b);
            }else{
                System.out.println("El valor introducido no es mayor a 0");
            }
          
        }
}
