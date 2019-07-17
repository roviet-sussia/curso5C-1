import java.util.*;

public class Sucursal {
    private ArrayList<Mesa> mesas;
    private ArrayList<Plato> pedidos;
    private Set<String> tipoDePlatos;

    public Sucursal() {

        this.mesas = new ArrayList<Mesa>();
        this.pedidos = new ArrayList<Plato>();
        this.tipoDePlatos = new HashSet<String>();
        this.tipoDePlatos.add("Milanesa con pure de papas");
        this.tipoDePlatos.add("Ravioles rellenos con carne");
        this.tipoDePlatos.add("Pizza a la Piedra");
        this.tipoDePlatos.add("Polenta con salsa Fileto");
        this.tipoDePlatos.add("Arroz primavera");
    }

    //Setters

    public void agregarPlatoAPreparar(Plato plato) {
        
        this.pedidos.add(plato);
    }

    public void agregarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    //Getters

    public ArrayList<Mesa> getMesas() {

        return this.mesas;
    }


    public ArrayList<Plato> getPedidos() {

        return this.pedidos;
    }

    public int cantPlatosSegunTipo(String tipo) {
        int cantidad = 0;
        for(Plato pedido : this.pedidos) {
            if( pedido.getNombre().equals( tipo ) ) {
                cantidad += pedido.getCantidad();
            }
        }
        return cantidad;
    }

    public String platoMasPedido() {
        String tipoMayor = "";
        int cantidadMayor = 0;
        for(String tipo : this.tipoDePlatos) {
            int cantidad = this.cantPlatosSegunTipo(tipo);
            if(cantidad > cantidadMayor) {
                tipoMayor = tipo;
                cantidadMayor = cantidad;
            }
        }
        return tipoMayor;
    }

    public String platoMenosPedido() {
        TreeSet<String> sorted = new TreeSet<String>(this.tipoDePlatos);
        String tipoMenor = sorted.first();
        int cantidadMenor = this.cantPlatosSegunTipo(tipoMenor);
        for(String tipo : this.tipoDePlatos) {
            int cantidad = this.cantPlatosSegunTipo(tipo);
            if(cantidad < cantidadMenor && cantidad != 0) {
                tipoMenor = tipo;
                cantidadMenor = cantidad;
            }
        }
        return tipoMenor;
    }
}