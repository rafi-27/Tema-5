package unidad_5.segundaParte;

import java.util.Scanner;

public class ejercicio_525 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
         * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
         * el
         * último dado. La introducción de números finaliza con la introducción de un 0.
         * Al final se mostrará:
         * El total de números introducidos, excluido el 0.
         */
        int contador = 0;
        int numer = 0;
        int mayor = 0;
        int contadorFallido = 0;

        System.out.print("Introduce el numero inicial: ");
        numer = teclado.nextInt();
        while (numer != 0) {
            System.out.print("Introduce un numero: ");
            mayor = teclado.nextInt();

            if (numer < mayor && numer != 0);
            {
            System.out.println("Error");
            contadorFallido = contadorFallido + 1;
            }

            mayor = numer;
            contador = contador + 1;

        }
        teclado.close();
    }
}