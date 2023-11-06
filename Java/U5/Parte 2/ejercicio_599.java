import java.util.Scanner;
public class ejercicio_599 {
    public static void main(String[] args) {
        Scanner numer = new Scanner(System.in);
        System.out.print("Introduce la cantidad de manzanas: ");
        int numero = numer.nextInt();
        System.out.printf("Tenemos "+numero+" manzana"+((numero>1)?"s":""));
    }
}