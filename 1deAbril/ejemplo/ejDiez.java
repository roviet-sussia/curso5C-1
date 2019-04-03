import java.util.Scanner;

public class ejDiez {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.println("Hola, ingrese un número y le diré si es primo o no lo es.");
        int numAEvaluar = numero.nextInt();

        int cantDivisores = 0;

        for (int i = 2 ; i<numAEvaluar  ; i++) {
        	
        	if (numAEvaluar % i == 0) {
        		cantDivisores++;
        	}
        }

        if (numAEvaluar != 0 && cantDivisores == 0 ) {
        	System.out.println("El número ingresado es primo!");
        }else{
        	System.out.println("El número ingresado no es primo.");
        }
    }
}