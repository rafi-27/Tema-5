package nivelcinco;
import java.util.Scanner;
public class ejercicio_54 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero maximo al que quieres llegar: ");
        int numeromax = teclado.nextInt();

        for (int i=1; i<=numeromax;i++){
            System.out.print(i+" ");
        }
        teclado.close();
}
}