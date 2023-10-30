package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_56 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean negativ = false;
        
        for(int i =1; i<=10;i++){
            System.out.print("Introduce 10 numeros y digo si hay negativos: ");
            int numer = teclado.nextInt();

            if (numer < 0){
                negativ = true;
            }
        }
            if (negativ){
                System.out.println("Hay numeros negativos");
    
            }
            teclado.close();
}
}