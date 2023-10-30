package segundaParte;
import java.util.Scanner;
public class ejercicio_531 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
/*A es el cociente de la división de 14 menos el mes entre 12,
• B es el año menos A
• C es el mes más doce veces A menos 2
• D es el cociente de la división de B entre 4
• E es el cociente de la división de B entre 100
• F es el cociente de la división de B entre 400
• G es el cociente de 31 veces C entre 12
• H es el día más B más D menos E más F más G
• I es el resto de la división de H entre 7
• Si I es 0, el día cae en Domingo; si I es 1, el día cae en Lunes; si I es 2, el día cae en
Martes, etc*/

        //Cantidad de variables = 
int año, mes, dia;

    do {        
        System.out.println("CÁLCULO DEL DÍA DE LA SEMANA");

        System.out.print("Escriba el número de día: ");
        dia = teclado.nextInt();

        System.out.print("Escriba el número de mes: ");
        mes = teclado.nextInt();

        System.out.print("Escriba el número de año (a partir de 1583): ");
        año = teclado.nextInt();

        if (año < 1583){
        System.out.println("¡Le he pedido un año posterior a 1582!");
            continue;
        }

        int A = (14-mes)/12;
        int B = año - A;
        int C = mes + (12*A) - 2;
        int D = B/4;
        int E = B/100;
        int F = B/400;
        int G = (C*31)/12;
        int H = dia + B + D - E + F + G;
        int I = H%7;

        switch (I) {
            case 0:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+ " domingo");   
                break;

            case 1:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+" lunes");
                break;

            case 2:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+" martes");
                break;

            case 3:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+ " miercoles");
                break;

            case 4:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+" jueves");
                break;
        
            case 5:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+" viernes");
                break;
            
            case 6:
                System.out.println("El dia "+dia+" del mes "+mes+" del año "+año+" es"+" sabado");
                break;
            
            default:
                break;
        }
        }while (año != 0);
        teclado.close();
    }
}