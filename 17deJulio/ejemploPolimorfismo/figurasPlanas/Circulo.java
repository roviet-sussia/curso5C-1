package ejemploPolimorfismo.figurasPlanas;

public class Circulo extends Figura {

    private double radio;

    public Circulo(){
        radio = 3;
    }

    public double getRadio(){
        return radio;
    }

    public void dibujar() {
        System.out.println("Dibujo Círculo");
    }

    public double calcularArea() {
        return 3.14 * radio * radio;
    }


}
