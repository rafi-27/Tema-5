package unidad_5.segundaParte;

public class ejercicio_pr {
    public static void main(String[] args){
        
        for (int numero = 1; numero <= 10000 ; numero++) {
        int sumatorio = 0;

            for (int i = 1; i <= numero-1; i++) {
                if (numero%i==0){
                    sumatorio+=i;
                }
            }
            if(numero==sumatorio){
                System.out.print(numero+" ");
            }
        }
        System.out.println();
}
}