import java.util.ArrayList;

public class Plato {
    private String nombre;
    private int mesa;
    private int pedido;
    private int cantidad;

    public Plato() {

    }

    public Plato(String newNombre, int newMesa, int newPedido, int newCantidad) {

        nombre = newNombre;
        mesa = newMesa;
        pedido = newPedido;
        cantidad = newCantidad;

    }

    //Setters
    public Plato setNombre(String newNombre) {

        this.nombre = newNombre;
        return this;

    }

    public Plato setMesa(int newMesa) {

        this.mesa = newMesa;
        return this;

    }

    public Plato setPedido(int newPedido) {

        this.pedido = newPedido;
        return this;

    }

    public Plato setCantidad(int newCantidad) {

        this.cantidad = newCantidad;
        return this;

    }

    //Getters
    public String getNombre() {

        return this.nombre;
    }

    public int getMesa() {

        return this.mesa;
    }

    public int getPedido() {

        return this.pedido;
    }

    public int getCantidad() {

        return this.cantidad;
    }

}

