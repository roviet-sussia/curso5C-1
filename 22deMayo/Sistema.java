import java.util.ArrayList;

public class Sistema {

    private ArrayList<Laboratorio> labs = new ArrayList<Laboratorio>();
    private ArrayList<Experimento> exps = new ArrayList<Experimento>();

    
    public Sistema() {

    }

    public Sistema(ArrayList<Laboratorio> NewLabs, ArrayList<Experimento> newExps) {

        labs = NewLabs;
        exps = newExps;
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Laboratorio> labs) {
        this.labs = labs;
    }

    public ArrayList<Experimento> getExps() {
        return exps;
    }

    public void setExps(ArrayList<Experimento> exps) {
        this.exps = exps;
    }

    public void addExperimentos(Experimento newExp) {

        exps.add(newExp);
    }

    public void addLaboratorio(Laboratorio newLab) {

        labs.add(newLab);
    }

    public String gestionarExperimento(int exp) {

        
        for(int i = 0; i < labs.size(); i++) {
            if(labs.get(i).isEmpty()) {

                labs.get(i).setExperimento(exps.get(exp));
                exps.remove(exp);
                return "Se ha gestionado el experimento satisfactoriamente.";
            }
            else for(Laboratorio labo : labs) {
                if(labs.get(i).isAvanzado()) {

                    labs.get(i).setExperimento(exps.get(exp));
                    exps.remove(exp);
                    return "Se ha gestionado el experimento satisfactoriamente.";
                }
            }
        }
        return "No se pudo localizar el experimento.";
    }
    public int compruebanLaHipotesis() {

        int aux = 0;
        for(Laboratorio x : labs) {
            if(x.isAvanzado() && x.consisteConLaHipotesis())
            aux++;
        }
        return aux;

    }
}