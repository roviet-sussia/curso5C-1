package ejemploPolimorfismo.figurasPlanas;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public void dibujar() {
        System.out.println("Dibujo Rectángulo");
    }

    public double calcularArea() {
        return base*altura;
    }
}
