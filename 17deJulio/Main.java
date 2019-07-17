import ejemploPolimorfismo.figurasPlanas.Circulo;
import ejemploPolimorfismo.figurasPlanas.Figura;
import ejemploPolimorfismo.figurasPlanas.Rectangulo;
import ejemploTiposEnumerados.BotellaDeAgua;
import ejemploTiposEnumerados.Dia;
import ejemploTiposEnumerados.LaboPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //--------------------------------------//

	    LaboPOO labo = new LaboPOO();

	    //cambio el día1 al día jueves
	    labo.setDia1(Dia.JUEVES);


        labo.getDia1();

        //--------------------------------------//

        /*
        no puedo hacer llamados al constructor
        porque el mismo es privado
        */

        //asigno referencia de uno de los elementos enumerados
        BotellaDeAgua b1 = BotellaDeAgua.MEDIANA;

        //devuelve la capacidad asociada a la botella mediana
        b1.getCc();

        /*
        otra forma de obtener la capacidad sin guardar
        la referencia en un tipo de variable
        */
        BotellaDeAgua.GRANDE.getCc();

        //--------------------------------------//

        List<Integer> lista1 = new ArrayList<>();
        List<Character> lista2 = new Stack<>();

        //ArrayList<Integer> lista3 = lista1;
        ArrayList<Integer> lista3 = (ArrayList<Integer>) lista1;

        ArrayList<Figura> figurasVarias = new ArrayList<>();
        figurasVarias.add(new Circulo());
        figurasVarias.add(new Rectangulo());

        for (Figura figuraActual : figurasVarias) {
            System.out.println(figuraActual.calcularArea());
        }

        figurasVarias.get(0).moverHacia(1, 1);
        figurasVarias.get(1).moverHacia(2, 2);

        //figurasVarias.get(0).getRadio(); // error

        Circulo c = (Circulo) figurasVarias.get(0);
        c.getRadio();









    }
}
