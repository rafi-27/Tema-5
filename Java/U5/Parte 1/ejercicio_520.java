package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_520 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la cantidad de numeros fibonacci que quieres que se muestren: ");
        int numer = teclado.nextInt();

        int numerInicio = 0;
        int numerSegundo = 1;

        for (int i = 0; i < numer; i++) {
            System.out.print(numerInicio+",");
            int suma = numerInicio+numerSegundo;
            numerInicio = numerSegundo;
            numerSegundo = suma;
        }
    teclado.close();    
    }
}