package nivelcinco;

public class ejercicio_523 {
    public static void main(String[] args){

        for (int i = 1; i <=10; i++) {
            int tabla = i;
            System.out.println("Siguente tabla: "+i);
            for(int j=1; j <= 10;j++){
                int multiplicador = j;
                int resultado = tabla*multiplicador;
                System.out.println(tabla+"x"+multiplicador+":"+resultado);
            }
    }
}
}