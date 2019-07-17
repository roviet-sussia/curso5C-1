public class WRITE extends Comando {

    public void run(Object... args) {
        int a = this.calc.stack.empty() ? 0 : this.calc.stack.pop();
        this.calc.memory.put(args[0].toString(), a);
    }
}