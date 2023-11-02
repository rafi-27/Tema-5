package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_516{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que vas a escribir: ");
        int max = teclado.nextInt();
        int suma = 0;
        int mayor = -9999999;
        int menor = 9999999;


        for (int i=1;i<=max;i++){
            System.out.println("Numero: "+i);
            int numer = teclado.nextInt();
            suma = suma + numer;

            if (numer > mayor){
                mayor = numer;
            }
            if (numer < menor){
                menor = numer;
            }
        }
        int media = suma/max;
            System.out.println("El mayor es: "+mayor);
             System.out.println("El menor es: "+menor);
              System.out.println("La media aritmetica es: "+media);
    
              teclado.close();
            }
    }