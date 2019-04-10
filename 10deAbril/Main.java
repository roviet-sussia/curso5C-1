

public class Main {

	public static void main(String[] args) {

		// declaración y construcción de arreglos

		int[] arreglo1 = new int[3];
		// si no lo inicializamos, en cada posición tendrá el valor cero.

		int[] arreglo2 = {1,2,3,4,5};


		int[] arrayA = new int[] {2,3};
		

        

		
		boolean[] arreglo3 = new boolean[0];
		boolean[] arrayC = new boolean[2];
		// si no lo inicializamos, en cada posición tendrá al booleano false.

		boolean[] arreglo4 = {true, false, true, false};


		String[] arreglo7 = new String[4];
		// si no lo inicializamos, en cada posición tendrá un null.

		String[] arreglo8 = {"casa","teclado"};
		


		//inicialización de valores:
		arreglo1[0] = 1;
		arreglo1[1] = 2;
		arreglo1[2] = 3;
		
		// longitud del arreglo
		int longitudDeArreglo = arreglo1.length;
		
		System.out.println("el tamaño del arreglo es: " + longitudDeArreglo);
		
		
	}

}