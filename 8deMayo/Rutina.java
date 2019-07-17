import java.util.*;

public class Rutina {
    private ArrayList<Instruccion> instrucciones;
    private String name;

    public Rutina(String newName) {
        this.instrucciones = new ArrayList<Instruccion>();
        this.name = newName;
    }

    public void agregarInstruccion(Instruccion ins) {
        this.instrucciones.add(ins);
    }

    public void removerUltimaInstruccion() {
        this.instrucciones.remove(this.instrucciones.size() - 1);
    }

    public void run(Calculadora calcu) {
        for(Instruccion ins : instrucciones) {
            ins.run(calcu);
        }
    }

    public ArrayList<Instruccion> getInstrucciones() {
        return this.instrucciones;
    }
    
    public String getName() {
        return this.name;
    }
}