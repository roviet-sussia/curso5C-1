package lauti;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Colectivo {

    private int personas;
    private ArrayList<Boleto> boletos = new ArrayList<Boleto>();
    private int metrosRecorridos;



    public Colectivo() {
        
        this.personas = 2;
        this.boletos.add(new Boleto(100, 25, 27));
        this.boletos.add(new Boleto(100, 50, 13));
        this.metrosRecorridos = 35;
    }

    public void subeAlguien(int newMetros, double newPago, int newCantV) {
        
        this.boletos.add(new Boleto(newMetros, newPago, newCantV));
        this.personas++;
    }

    public void bajaAlguien(int a) {

        if(this.personas == 0) 
            System.out.println("No hay nadie");
        else {
        this.personas = this.personas-1;
        this.boletos.remove(a);
    }
        
    }

    public boolean checkOrden(){
        
        double debePagar = 0;
        
        if(this.personas != this.boletos.size()) {
            System.out.println("Personas:" + this.personas);
            System.out.println("Boletos:" + this.boletos.size());
            return false;
        }

        for (int i = 0; i < this.boletos.size(); i++) {
            
            debePagar = 0.5 * this.boletos.get(i).getMetros();
            if(this.boletos.get(i).getDescuento())
                debePagar = debePagar/2;
            if(this.boletos.get(i).getPago() != debePagar) {
                System.out.println("Persona que pago diferente a lo que debia:  Pasajero " + i);
                return false;
            }
            if(this.metrosRecorridos > this.boletos.get(i).getMetros()) {
                System.out.println("Pasajero " + i + " viajo mas de lo que deberia.");
            return false;
        }
        }
        return true;
    }

    public int getCantBoletos() {

        return boletos.size();
    }
}