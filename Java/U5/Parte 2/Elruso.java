import java.util.Scanner;
public class Elruso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
    Al terminar, mostrará lo siguiente:
    – mayor numero introducido
    – menor numero introducido
    – suma de todos los numeros
    – suma de los numeros positivos
    – suma de los numeros negativos
    – media de la suma (la primera que pido)
    El número -1 no contara como número. */

        int mayor = -999999;
        int menor = 999999;

        int numero = 0;

        int suma = 0;
        int sumaposis = 0;
        int sumanega = 0;

        int media = 0;

        int cont = 0;
        while (numero != -1) {
            System.out.print("Escribe numeros o (-1 para salir.): ");
            numero = teclado.nextInt();

            suma=suma+numero;

    

            if(numero>0){
                sumaposis=sumaposis+numero;
            }

            if(numero<0){
                sumanega=sumanega+numero;
            }


            if (numero > mayor){
                mayor=numero;
            }

            if(numero < menor){
                menor=numero;
            }

            cont++;
        }

        media = suma/cont;

        System.out.println("La suma: "+suma);
        System.out.println("El mayor: "+mayor);
        System.out.println("El menor: "+menor);
        System.out.println("La suma de los positivos: "+sumaposis);
        System.out.println("La suma de los negativos: "+sumaposis);
        System.out.println("La media: "+media);


    }
}
