package unidad_5.segundaParte;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejercicio_532 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int numeroAleatorio = 0;
        String intro= "";
        do {
            System.out.println("Juego de los Dados (Escribir tira.)");
            numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            intro = teclado.next();
            System.out.println(numeroAleatorio);
            contador++;
        } while (numeroAleatorio != 5);

        System.out.println("Se ha lanzado un total de " + contador + " veces para salir el 5.");
        teclado.close();
        
    }
}