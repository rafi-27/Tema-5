package unidad_5.nivelcinco;

import java.util.Scanner;

public class ejercicio_517 {
    public static void main(String[] args){
        int nMinimo=1;
        int nMaximo=100;
        int numero=0;
        int propuesta=0;
        Scanner lector=new Scanner(System.in);
            
        while (numero!= 3) {
            propuesta=(nMinimo+nMaximo)/2;
            System.out.println(propuesta);
            numero=lector.nextInt();
            if (numero==1){
                nMinimo=propuesta+1;
            }
            else if (numero==2){
                nMaximo=propuesta-1;
            }
        }
        System.out.println(numero);
        lector.close();
    }
}