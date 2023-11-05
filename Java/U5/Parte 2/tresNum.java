import java.util.Scanner;

public class tresNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.print("Introduce el primer numero: ");
        a = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        b = teclado.nextInt();

        System.out.print("Introduce el tercer numero: ");
        c = teclado.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + "," + b + "," + c + ".");
            } else {
                System.out.println(a + "," + c + "," + b + ".");
            }
        } else {
            if (b > a && b > c) {
                if (a > b) {
                    System.out.println(b + "," + a + "," + c + ".");
                } else {
                    System.out.println(b + "," + c + "," + a + ".");
                }
            } else {
                if (c > a && c > b) {
                    if (a > b) {
                        System.out.println(c + "," + a + "," + b + ".");
                    } else {
                        System.out.println(c + "," + b + "," + a + ".");
                    }
                }
            }
        }
    }
}