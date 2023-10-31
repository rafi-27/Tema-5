package unidad_5.segundaParte;

import java.util.Scanner;

public class ejercicio_528 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max;
        do {
            System.out.print("Introduce un numero entre el 1-20,(0 para salir.) ");
            max = teclado.nextInt();
            if (max <= 20 && max > 0) {
                for (int i = 1; i <= max; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                        if (i == j) {
                            System.out.println();
                        }
                    }
                }
            } else {
                System.out.println("Has introducido un numero que esta fuera del rango permitido");
            }
        } while (max != 0);
        teclado.close();
    }
}