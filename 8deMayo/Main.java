public class Main {

    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        Programa p1 = new Programa("jorge")
            .agregarRutina("a")
            .agregarInstruccion("a", new Instruccion(new PUSH(), 13))
            .agregarInstruccion("a", new Instruccion(new PUSH(), 3))
            .agregarInstruccion("a", new Instruccion(new ADD()))
            .agregarRutina("b")
            .agregarInstruccion("b", new Instruccion(new PUSH(), 50))
            .agregarInstruccion("b", new Instruccion(new RAND(), 10))
            .agregarInstruccion("b", new Instruccion(new MUL()))
            .agregarRutina("c")
            .agregarInstruccion("c", new Instruccion(new WRITE(), "x"))
            .agregarInstruccion("c", new Instruccion(new WRITE(), "y"))
            .agregarRutina("d")
            .agregarInstruccion("d", new Instruccion(new READ(), "x"))
            .agregarInstruccion("d", new Instruccion(new READ(), "y"))
            .agregarInstruccion("d", new Instruccion(new ADD()))
            .agregarInstruccion("d", new Instruccion(new WRITE(), "z"));
        calcu.cargarPrograma(p1);
        calcu.ejecutar("a");
        calcu.ejecutar("b");
        calcu.ejecutar("c");
        calcu.ejecutar("d");
        System.out.println(calcu.checkMemory("x"));
        System.out.println(calcu.checkMemory("y"));
        System.out.println(calcu.checkMemory("z"));
    }
}
