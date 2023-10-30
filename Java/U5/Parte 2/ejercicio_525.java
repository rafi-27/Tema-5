package segundaParte;
import java.util.Scanner;
public class ejercicio_525 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
/*Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el
último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0. */
        int contador = 0;
        int numer = 0;
        int mayor = 0;
        int contadorFallido = 0;
        System.out.println("Introduce un numero inicial:");
        numer = teclado.nextInt();
        do {
            System.out.println("Escribe un numero mayor: ");
            mayor = teclado.nextInt();

            if (numer > mayor){
                System.out.println("Fallo es menor");
                System.out.println("Introduce un numero inicial:");
                numer = teclado.nextInt();
                contadorFallido+=1;
                contador+=1;
            }

        contador+=1;
        }while(numer != 0 ||mayor != 0);
        contadorFallido = contadorFallido-1;
        System.out.println("Total de numeros introducidos: "+contador);
        System.out.println("Total de fallos: "+contadorFallido);
        teclado.close();
    }
}
