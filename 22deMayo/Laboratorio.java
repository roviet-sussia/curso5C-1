

public class Laboratorio {

    private Experimento experimento;
    private Boolean ongoing;

    public Experimento getExperimento() {
        return experimento;
    }

    public void setExperimento(Experimento experimento) {
        
        this.experimento = experimento;
        this.ongoing = true;
    }

    public Boolean isEmpty() {
        
        return !ongoing;
    }

    public void setOngoing(Boolean ongoing) {
        
        this.ongoing = ongoing;
    }

    public Boolean isAvanzado() {

        int aux = 0;
        for (Character resultado : experimento.getObservaciones()) { 
            if(resultado != 'r')
                aux++;
        }
        if (aux > 30)
        return true;
        else return false;
    }

    public String addObservacion(Character obs) {

        int aux = 0;
        this.experimento.addObservacion(obs);
        for(Character ob : this.experimento.getObservaciones()) {
            if(ob == 'r')
            aux++;
        }
        if(aux > (experimento.getObservaciones().size() - aux)) {

            experimento.getObservaciones().clear();
            ongoing = false;
            return "Demasiadas observaciones anomalas, se ha cancelado el experimento.";
        }
        else return "Se ha agregado la observacion satisfactoriamente.";
    }

    public Boolean consisteConLaHipotesis() {

        int auxy = 0;
        int auxn = 0;
        for(Character x : experimento.getObservaciones()) {
            if(x == 'y')
            auxy++;
            if(x == 'n')
            auxn++;
        }
        if((auxy > auxn) && (auxy > experimento.getObservaciones().size() - auxy - auxn))
        return true;
        else return false;
    }
}