public class READ extends Comando {

    public void run(Object... args) {
        this.calc.stack.push(this.calc.checkMemory((String) args[0]));
    }
}