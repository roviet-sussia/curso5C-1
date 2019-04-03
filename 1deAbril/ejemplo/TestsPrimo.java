public class TestsPrimo{

	public static void main(String[] args){

		// algunos casos de test

		Primo num = new Primo(); 

   		System.out.println("TEST cantDivMayoresAUno. Caso con número cero. ");
		num.setNumeroAEvaluar(0);
   		int valorEsperado = 0;
   		int valorObtenido = num.cantDivMayoresAUno();
   		System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");


		System.out.println("TEST cantDivMayoresAUno. Caso con número uno. ");
		num.setNumeroAEvaluar(1);
   		valorEsperado = 0;
   		valorObtenido = num.cantDivMayoresAUno();
   		System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");


   		System.out.println("TEST cantDivMayoresAUno. Caso con número 4. ");
		num.setNumeroAEvaluar(4);
   		valorEsperado = 1;
   		valorObtenido = num.cantDivMayoresAUno();
   		System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");


   		System.out.println("TEST esPrimo. Caso con número cero. ");
		num.setNumeroAEvaluar(0);
   		boolean valEsperado = false;
   		boolean valObtenido = num.esPrimo();
   		System.out.println((valEsperado==valObtenido)?"Pasó el test.\n":"No pasó el test.\n");

   		







	}
}