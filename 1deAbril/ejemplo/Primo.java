public class Primo{
	
	private int numeroAEvaluar;

	public Primo(){
		numeroAEvaluar = 0;
	}

	public Primo(int numeroAEvaluar){
		this.numeroAEvaluar = numeroAEvaluar;
	}

	public int getNumeroAEvaluar(){
		return numeroAEvaluar;
	}

	public void setNumeroAEvaluar(int numeroAEvaluar){
		this.numeroAEvaluar = numeroAEvaluar;
	}

	public int cantDivMayoresAUno(){

		int cantDivisores = 0;

        for (int i = 2 ; i < numeroAEvaluar ; i++) {
        	
        	if (numeroAEvaluar % i == 0) {
        		cantDivisores++;
        	}
        }

        return cantDivisores;
	}

	public boolean esPrimo(){

		boolean siEsPrimo = false;

        if (numeroAEvaluar != 0 && this.cantDivMayoresAUno() == 0) {
        	siEsPrimo = true;
        }

        return siEsPrimo;
	}

	public String esPrimoConPrint(){
		if( this.esPrimo() ){
			return "El número ingresado es primo!";
		}else{
			return "El número ingresado no es primo.";
		}
	}

	//Método extra
	public boolean esPar(){
		return (numeroAEvaluar % 2 == 0);
	}
}
