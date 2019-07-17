public class RAND extends Comando {

    public void run(Object... args) {
        this.calc.stack.push((int) (Math.random() * (int) args[0]));
    }
}