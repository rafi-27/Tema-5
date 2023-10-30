package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_57{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
/*Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
indicando cuántos son positivos y cuantos negativos.  */
        int contpos = 0;
        int contnega = 0;

        System.out.println("Introduce 10 numeros");
        
        for (int i=1; i <= 10; i++){
            System.out.print("Numero "+i+": ");
            int numer = teclado.nextInt();

            if (numer > 0){
                contpos++;
            }else{
                contnega++;
            }
        }
        System.out.println("Numeros positivos: "+contpos);
        System.out.println("Numeros negativos: "+contnega);
    teclado.close();
    }
}