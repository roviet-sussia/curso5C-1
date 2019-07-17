import java.util.*;

public class Calculadora {
    public Stack<Integer> stack;
    public Map<String, Integer> memory;
    private Programa prog;

    public Calculadora() {
        this.stack = new Stack<Integer>();
        this.memory = new HashMap<String,Integer>();
    }

    public void cargarPrograma(Programa prog) {
        this.prog = prog;
        prog.setCalc(this);
        System.out.println("El programa " + this.prog.getName() + " ha sido cargado...");
    }

    public void ejecutar(String rutina) {
        this.prog.ejecutarRutina(rutina);
    }

    public int checkMemory(String var) {
        return (this.memory.containsKey(var)) ? this.memory.get(var) : 0;
    }
}