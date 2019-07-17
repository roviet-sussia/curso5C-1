import java.util.ArrayList;

public class Mesa {
    private ArrayList<Plato> platos;

    
    public Mesa() {
        
        this.platos = new ArrayList<Plato>();
    } 

    //Setters
    
    public void agregarPedidoDeClienteActual(Plato plato) {
        
        this.platos.add(plato);
    }

    public void sacarPlatos() {
        this.platos.clear();
    }

    //Getters
    public ArrayList<Plato> getPlatos() {
        
        return this.platos;
    }
}  