package unidad_5.segundaParte;

import java.util.Scanner;

public class ejercicio_534_C {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero entero: ");
        String numeroStr = teclado.nextLine();

        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            char digito = numeroStr.charAt(i);
            System.out.println(digito);
        }

        teclado.close();
    }
}
