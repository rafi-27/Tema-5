import java.util.Scanner;
//package unidad_5.segundaParte;
public class prueba {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        int dm, um, c, d, u;
        // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
        // dm um c d u: dm (decenas de millar), um:(unidades de millar)
        // c: (centenas), d: (decenas), u: (unidades)

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = Entrada.entero();
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;
        // lo imprimimos al revés:
        System.out.println(u + " " + d + " " + c + " " + um + " " + dm);
        // otra forma de hacerlo es
        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        System.out.println(num);
        //https://elhacker.info/manuales/Lenguajes%20de%20Programacion/Java/Ejercicios-de-Programacion-en-Java.pdf
    }
}
