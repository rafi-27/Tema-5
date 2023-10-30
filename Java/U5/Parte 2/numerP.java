package segundaParte;

public class numerP {
    public static void main(String[] args){
        int sumatorio = 0;
        int numero = 0;
        for (numero = 2; numero <=10000; numero++) {
            
            for (int i = 2; i <= numero-1; i++) {
                if (numero%i==0) 
                sumatorio+=i;
            }
        }
        if(numero == sumatorio){
            System.out.println(sumatorio);
            System.out.println(numero);
        }
    }
}
