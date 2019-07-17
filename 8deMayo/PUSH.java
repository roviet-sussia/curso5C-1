public class PUSH extends Comando {

    public void run(Object... args) {
        this.calc.stack.push((int) args[0]);
    }
}