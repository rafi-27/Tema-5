package segundaParte;
import java.util.Scanner;
public class ejercicio_524 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
/*Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado. */
        int contador = 0;
        int multiplo = 0;
        System.out.print("Introduce el numero y te muestro sus multiplos de 3: ");
        int max = teclado.nextInt();

        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0){
                contador = contador + 1;
                multiplo = contador;
            }
        }
        System.out.println("Cantidad de multiplos de 3: "+multiplo);
        teclado.close();
    }
    
}