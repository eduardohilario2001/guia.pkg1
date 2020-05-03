package guia.pkg1;
import java.util.Scanner;
public class tarea8 {
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
        System.out.println("Ingrese lado");
    int a=x.nextInt();
        System.out.println("Area del cuadro: " +a *a);
        System.out.println("Perimetro " +a * 4);
    }
}
