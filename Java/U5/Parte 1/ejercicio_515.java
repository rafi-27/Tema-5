package unidad_5.nivelcinco;
import java.util.Scanner;

public class ejercicio_515{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
/*Realiza un programa que muestre la tabla de multiplicar de un número que se pide
por teclado entre el 1 y el 9. Se debe controlar que el número se encuentra entre el
rango permitido y volver a pedirlo mientras que no sea correcto. Realiza la solución de
mostrar la tabla utilizando un bucle do-while */
        
        System.out.print("Introduce una tabla del 1-9:");
        int tabla = teclado.nextInt();

        while(tabla < 1 || tabla > 9){
            System.out.print("Fuera de rango porfavor introduce una tabla del 1-9: ");
            tabla = teclado.nextInt();
        }
       
        int i = 1;
        do {
            int result = tabla * i;
            System.out.println(tabla+"x"+i+":"+result );
            i = i + 1;
        } while (i <= 10);
teclado.close();
    }
}