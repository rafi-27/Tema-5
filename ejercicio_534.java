package segundaParte;
import java.util.Scanner;
public class ejercicio_534 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero entero: ");
        int numero = teclado.nextInt();

        while (numero > 0) {
            int digito = numero % 10;
            numero%=10;
            System.out.println(digito+" ");            
        }
System.out.println();
teclado.close();
    }
}