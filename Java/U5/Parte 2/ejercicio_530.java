package unidad_5.segundaParte;

import java.util.Scanner;

public class ejercicio_530 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max;

        System.out.print("Dime un numero para realizar su piramide: ");
        max = teclado.nextInt();

        for (int i = 1; i <= max; i++) {
            
            for (int j = 1; j <= max - i;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Alreves:
        System.out.print("Dime un numero para realizar su piramide: ");
        max = teclado.nextInt();

        for (int i = max; i >= 1; i--) {
            
            for (int j = 1; j <= max - i;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        teclado.close();
}
}