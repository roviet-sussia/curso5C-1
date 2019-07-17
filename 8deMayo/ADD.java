public class ADD extends Comando {
    public void run(Object... args) {
        if(this.calc.stack.empty()) {
            this.calc.stack.push(0);
            return;
        }
        int a = this.calc.stack.pop();
        if(this.calc.stack.empty()) {
            this.calc.stack.push(a);
            return;
        }
        this.calc.stack.push(a + this.calc.stack.pop());
    }
}