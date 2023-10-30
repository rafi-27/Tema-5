package segundaParte;
import java.util.Scanner;
public class ejercicio_535 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    /*35. Realiza un programa que permita introducir números y nos muestre el resultado de
sumarlos, hasta que introduzca un número mayor que 1000. Si no se introduce un
número mayor que 1000 el programa finalizará después de introducidos 15 números */
        int suma = 0;
        int contador = 0;
        int numero;
        do {
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();
            if (numero == 1000 || contador > 15){
                break;
            }
            suma+=numero;
            contador++;
        }while (numero < 1000 || contador >= 15);
        
       System.out.println("Resultao de la suma es "+suma);
       System.out.println("El contador a llegado a: "+contador);
       teclado.close();
    }
    
}