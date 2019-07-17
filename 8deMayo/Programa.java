import java.util.*;

public class Programa {

    private Map<String,Rutina> rutinas;
    private String name;
    private Calculadora calc;

    public Programa(String newName) {
        this.name = newName;
        this.rutinas = new HashMap<String,Rutina>();
    }

    public Programa agregarRutina(String rutina) {
        this.rutinas.put(rutina, new Rutina(rutina));
        return this;
    }

    public Programa agregarInstruccion(String rutina, Instruccion ins) {
        this.rutinas.get(rutina).agregarInstruccion(ins);
        return this;
    }

    public Programa removerUltimaInstruccion(String rutina) {
        this.rutinas.get(rutina).removerUltimaInstruccion();
        return this;
    }

    public void ejecutarRutina(String name) {
        this.rutinas.get(name).run(this.calc);
    }

    //Getters

    public String getName() {
        return this.name;
    }

    public Map<String,Rutina> getRutinas() {
        return this.rutinas;
    }

    //Setters

    public void setCalc(Calculadora calcu) {
        this.calc = calcu;
    }
}
