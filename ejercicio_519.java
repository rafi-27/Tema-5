package nivelcinco;
import java.util.Scanner;
public class ejercicio_519 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero postitivo: ");
        int num = teclado.nextInt();

        while (num < 0){
            System.out.print("Introduce un numero postivo: ");
            num = teclado.nextInt();
        }
        int contadorDivisores = 1;
        while(contadorDivisores <= num){          
            if (num%contadorDivisores==0)
            {
            System.out.println(contadorDivisores);
            }
            contadorDivisores = contadorDivisores + 1;
        }
    teclado.close();
    }
}