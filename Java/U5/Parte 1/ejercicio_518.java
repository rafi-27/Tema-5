package unidad_5.nivelcinco;
import java.util.Scanner;
public class ejercicio_518{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de dinero y muestros los billetes: ");
        int cantidad = teclado.nextInt();
        int billete500 = 0;
        int billete200 = 0;
        int billete100 = 0;
        int billete50 = 0;
        int billete20 = 0;
        int billete10 = 0;
        int billete5 = 0;
        while(cantidad > 500){
            billete500 = cantidad / 500;
            cantidad = cantidad%500;
        }
        while(cantidad > 200){
            billete200 = cantidad / 200;
            cantidad = cantidad%200;
        }
        while(cantidad > 100){
            billete100 = cantidad / 100;
            cantidad = cantidad%100;
        }
        while(cantidad > 50){
            billete50 = cantidad / 50;
            cantidad = cantidad%50;
        }
        while(cantidad > 20){
            billete20 = cantidad / 20;
            cantidad = cantidad%20;
        }
        while(cantidad > 10){
            billete10 = cantidad / 10;
            cantidad = cantidad%10;
        }
        while(cantidad >= 5){
            billete5 = cantidad / 5;
            cantidad = cantidad%5;
        }

        System.out.println("De 500 hay: "+billete500);
        System.out.println("De 200 hay: "+billete200);
        System.out.println("De 100 hay: "+billete100);
        System.out.println("De 50 hay: "+billete50);
        System.out.println("De 20 hay: "+billete20);
        System.out.println("De 10 hay: "+billete10);
        System.out.println("De 5 hay: "+billete5);
teclado.close();
    }
}
