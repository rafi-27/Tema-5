package segundaParte;

import java.util.Scanner;

public class ejercicio_536 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
        // a.)
        System.out.println("Ejercicio A");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // *b.)
        System.out.println("Ejercicio B");
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a);
            }
            System.out.println();
        }

        // c.)
        System.out.println("Ejercicio C");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        // d.)
        System.out.println("Ejercicio D");
        for (int h = 9; h >= 1; h--) {
            for (int y = 9; y >= h; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
        teclado.close();
    }

}