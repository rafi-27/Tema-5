package segundaParte;

public class ejercicio_526 {
    public static void main(String[] args) {
/*26. Realiza un programa para calcular la suma de los cuadrados de los 5 primeros
números naturales. */        
int suma = 0;
for (int i = 1; i <= 5; i++) {
    double result = Math.pow(i, 2);
    suma+=result;
}
System.out.println(suma);
    }
}