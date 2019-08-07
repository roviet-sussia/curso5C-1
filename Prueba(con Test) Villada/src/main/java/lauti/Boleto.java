package lauti;

import java.util.*;

public class Boleto {

    private int metros;
    private double pago;
    private int cantViajes;


    public Boleto(int newMetros, double newPago, int newCantV) {
        
        this.metros = newMetros;
        this.pago = newPago;
        this.cantViajes = newCantV;
    }
    
    public Boleto() {

        this.metros = 30;
        this.pago = 15.00;
        this.cantViajes = 12;
    }
    
    public void setViajes(int newCant) {

        this.cantViajes = newCant;
    }
    
    public int getMetros() {

        return this.metros;
    }

    public double getPago() {

        return this.pago;
    }

    public void setPago(double newPago) {

        this.pago = newPago;
    }
    
    public void setMetros(int newMetros) {

        this.metros = newMetros;
    }

    public Boolean getDescuento() {

        if(this.cantViajes > 25)
            return true;
            else return false;
    }

}