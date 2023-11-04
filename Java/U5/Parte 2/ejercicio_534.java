package unidad_5.segundaParte;
import java.util.Scanner;
public class ejercicio_534 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero entero: ");
        int numero = teclado.nextInt();
        int cont = 0;
        int valor = numero;
        while (numero > 0) {
            //int digito = numero % 10;
            numero/=10;
            cont++;
            //System.out.println(digito+" ");            
        }
        System.out.println("El numero "+valor+" tiene "+cont+" digitos.");
System.out.println();
teclado.close();
    }
}