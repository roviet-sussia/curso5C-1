import java.util.HashSet;

public class Experimento {

    private HashSet<Character> observaciones = new HashSet<Character>();

    public Experimento() {
        
    }

    public Experimento(HashSet<Character> newObs) {
        
        observaciones = newObs;
    }
    
    public HashSet<Character> getObservaciones() {
        
        return observaciones;
    }

    public void setObservaciones(HashSet<Character> observaciones) {
       
        this.observaciones = observaciones;
        // y para confirmado, n para confirmado lo contrario a la hipotesis y r para raro
    }
    

    public Boolean isLegitimo() {

        int aux = 0;
        for (Character resultado : observaciones) { 
            if(resultado != 'r')
                aux++;
        }
        if (aux > 30)
        return true;
        else return false;
    }

    public void addObservacion(Character x) {

        this.observaciones.add(x);
    }
        
    }