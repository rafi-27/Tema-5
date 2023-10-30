package unidad_5.nivelcinco;
public class ejercicio_511 {
    public static void main(String[] args){
    int suma = 0;    
    for(int i=100;i <= 200;i = i+2){
        System.out.println(i);
        suma=i+suma;
        }
        System.out.println("La suma de los pares es: "+suma);
    int sum = 0;
    for(int i=101; i<200;i = i+2){
        System.out.println(i);
        sum+= i;
    }
    System.out.println("La suma de los numeros impares es: "+sum);
    }
}