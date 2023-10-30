package nivelcinco;

public class ejercicio_59 {
    public static void main(String[] args){
        int suma = 0;
        int producto = 1;
        for (int i=1;i <= 10;i++){
            suma+=i;
            producto*=i;
        }
        System.out.println(suma);
        System.out.println(producto);
    }
}