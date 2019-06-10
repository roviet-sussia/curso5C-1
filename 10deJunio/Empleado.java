package otrasSubClases;
import superClases.Persona;

public class Empleado extends Persona {

    private String ocupacion;

    public Empleado(){
        //super(23);
    }

    public Empleado(String nombre){
        super(nombre);
        this.ocupacion = "ingeniero";
    }
    
    public static void main(String[] args){
        Empleado e1 = new Empleado("Roberto");
        Empleado e2 = new Empleado();
        Persona p = new Persona();

    }
}
