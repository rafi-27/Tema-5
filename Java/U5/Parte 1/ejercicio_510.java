package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_510 {
    public static void main(String[] args){
        boolean diez = false;
        Scanner teclado = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Introduce una nota(0-10) para salir (-1): ");
            nota = teclado.nextInt();
            if (nota == 10){
                diez = true;
            }
        } while (nota != -1);
        if (diez){
            System.out.println("Se ha introducido una nota con valor 10.");
        }
    teclado.close();
    }
}
