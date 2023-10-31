package unidad_5.segundaParte;
import java.util.Scanner;
public class ejercicio_527 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
/*27. Realiza un programa que lea un número y a continuación escriba el carácter “*”
tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no
sea positivo se deberá escribir un único asterisco. */
        int max = 0;
        System.out.print("Dime un número: ");
        max = teclado.nextInt();

        for (int i = 1; i <= max ; i++) {
            System.out.print("*"+" ");            
        }
        teclado.close();
    }
}
