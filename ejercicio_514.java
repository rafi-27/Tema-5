package nivelcinco;

public class ejercicio_514{
    public static void main(String[] args){

    int numerInicio = 860;
    int numerFin = 460;
    System.out.println("Con un while:");
    while(numerInicio >= numerFin){
        System.out.println(numerInicio);
        numerInicio = numerInicio-10;
    }

    numerInicio = 860;
    numerFin = 460;
    System.out.println("Con un do-while");
    do {
        System.out.println(numerInicio);
        numerInicio = numerInicio - 10;
    } while (numerInicio >= numerFin);

    numerInicio = 860;
    numerFin = 460;
    System.out.println("Con un For");
    for(int i= numerInicio; i >= numerFin;i = i-10){
        System.out.println(i);
    }
    
    }
}