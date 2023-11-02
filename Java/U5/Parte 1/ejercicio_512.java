package unidad_5.nivelcinco;

import java.util.Scanner;

public class ejercicio_512 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        System.out.print("Introduce la potencia: ");
        int potencia = teclado.nextInt();
        int resultado = 1;
        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * exponente;
        }
        System.out
                .println("El exponente " + exponente + " con una potencia de " + potencia + " es igual a " + resultado);
        teclado.close();
    }
}