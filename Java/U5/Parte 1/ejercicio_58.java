package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_58{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
/*Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
indicando cuántos son positivos y cuantos negativos.  */
        int contpos = 0;
        int contnega = 0;
        boolean negativ = false;
        
        //System.out.println("Introduce numeros (0 es para salir.)");
        //int numer = teclado.nextInt();
        int numer = 1;
        while(numer != 0){        
        numer = teclado.nextInt();
             
        if (numer >= 0){
                contpos++;
        }else{
                contnega++;
                negativ = true;
            }
        }
        if (negativ){
                System.out.println("Hay negativos");
        }
        System.out.println("Numeros positivos: "+contpos);
        System.out.println("Numeros negativos: "+contnega);
teclado.close();    
}
}