package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_522 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int primerNumero = teclado.nextInt();

        System.out.print("Dime otro numero: ");
        int segundoNumero = teclado.nextInt();

        int contador = 0;

        for (int i = primerNumero; i <= segundoNumero ; i++) {
            
            if (i % 3 == 0){
                System.out.println(i);
                contador++;
            }
            if (contador >= 3){
                break;
            }
        }       
        teclado.close();
    }         
}