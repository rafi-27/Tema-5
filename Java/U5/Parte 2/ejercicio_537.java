package unidad_5.segundaParte;

import java.util.Scanner;

public class ejercicio_537 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
         * Lo primero que ha de hacer es pedir la cantidad de entradas que se pondrán a
         * la venta,
         * después irá solicitando la cantidad de entradas que quiere comprar,
         * estando limitado a un máximo de 10 por cliente.
         * El programa finalizará cuando se agoten las entradas mostrando la cantidad de
         * entradas que se ha llevado el que más ha comprado.
         */

        // Preguntamos la cantidad de entradas que vamos a poner en venta:

        int mayor = -999999999;
        int cantidad;
        int entradas;
        System.out.print("Cantidad de entradas ala venta: ");
        cantidad = teclado.nextInt();

        do {
            System.out.println("Hay ala venta, " + cantidad + " de entradas");
            System.out.print("Cuantas entradas quieres comprar: ");
            entradas = teclado.nextInt();

            while (entradas > 10 || entradas < 0) {
                System.out.println("No puedes comprar mas de diez ni menos de 0.");
                System.out.print("Introduce de nuevo la cantidad entradas que quieres: ");
                entradas = teclado.nextInt();
                continue;
            }

            if (entradas > mayor) {
                mayor = entradas;
            }

            cantidad = cantidad - entradas;

        } while (cantidad > 0);
        System.out.println("La mayor cantidad de entradas vendidas es de " + mayor);
        teclado.close();
    }
}