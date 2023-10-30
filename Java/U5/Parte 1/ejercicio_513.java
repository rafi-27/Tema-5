package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_513 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numer;
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("Introduce la opción deseada: ");
            numer = teclado.nextInt();
            switch(numer){
                case 1:
                System.out.println("Has seleccionado sumar");
                break;
                case 2:
                System.out.println("Has seleccionado restar");
                break;
                case 3:
                System.out.println("Has seleccionado multiplicar");
                break;
                case 0:
                break;
            }
            teclado.close();
    }
    while(numer != 0);
    }

}