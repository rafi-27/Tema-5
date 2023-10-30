package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_55 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero y digo su factorial: ");
        int num = teclado.nextInt();
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact = i*fact;
        }
       System.out.println(fact);
    teclado.close();
    }
}
