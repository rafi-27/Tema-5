package nivelcinco;
import java.util.Scanner;
public class ejercicio_521 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero y te digo si es primo: ");
        int prim = teclado.nextInt();

        int contador = 0;

        for(int i=1;i <= prim;i++){
             if (prim % 1 == 0 && prim%prim==0)
             contador++;
        }

        if (contador>1){
            System.out.println("El numero "+prim+" no es primo.");
        }else{
            System.out.println("El numero "+prim+" es primo.");
        }
    teclado.close();
    }
}