package ejemploPolimorfismo.figurasPlanas;

public class Figura implements FiguraPlana {

    Punto origen;

    public Figura(){
        origen = new Punto();
    }
    public void moverHacia(int x, int y) {
        this.origen.setX(x);
        this.origen.setY(y);
    }

    public void dibujar() {
        System.out.println("Dibujo una figura");
    }

    public void redimensionar() {
        System.out.println("Redimensiono una figura");
    }


    public double calcularArea() {
        return 0.0;
    }

}
