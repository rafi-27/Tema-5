package unidad_5.segundaParte;
import java.util.Scanner;
public class ejercicio_529 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
/*29. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A.
Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares. */        
        int primerNumero, segundoNumero, contador=0;

        System.out.print("Introduce un numero: ");
        primerNumero = teclado.nextInt();

        System.out.print("Introduce un numero mayor que el anterior: ");
        segundoNumero = teclado.nextInt();

        while (segundoNumero < primerNumero) {
            System.out.println("Introduce un numero mayor que el anterior: ");
            segundoNumero = teclado.nextInt();
        }

        for (int i=primerNumero; i <= segundoNumero; i++) {
            System.out.print(i+" ");
            if (i%2==0){
                contador+=1;
            }            
        }
        System.out.println();
        System.out.println("La cantidad de pares que hay es de: "+contador);
        teclado.close();
    }
}
