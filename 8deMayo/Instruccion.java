import java.util.*;

public class Instruccion {

    private Comando com;
    private Object[] args;
    
    public Instruccion(Comando comando, Object... args) {
        this.com = comando;
        this.args = args;
    }

    public void run(Calculadora calc) {
        com.setCalc(calc);
        com.run(this.args);
    }

    public Comando getComando() {
        return this.com;
    }
}