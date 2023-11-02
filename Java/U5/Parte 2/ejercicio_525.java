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
        int numeroInicio = 0;
        int numeroDos = 0;
        int contadorFallido = 0;

        System.out.print("Introduce el numero inicial: ");
        numeroInicio = teclado.nextInt();

        do{
        System.out.print("Introduce un numero: ");
        numeroDos = teclado.nextInt();
        if (numeroDos > numeroInicio){
            numeroInicio = numeroDos;
        }else{
            System.out.println("Error");
            contadorFallido++;
            numeroInicio = numeroDos;
        }
            contador++;

        }while (numeroInicio != 0 && numeroDos != 0);
        contadorFallido-=1;
        System.out.println("Total de numeros introducidos: "+contador);
        System.out.println("Total de fallos: "+contadorFallido);
        teclado.close();
    }
}