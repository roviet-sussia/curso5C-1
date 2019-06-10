package superClases.subClases;

public class Persona {

    private String nombre;
    private int edad;
    protected int dni;

    public Persona(){
        this("Juan");
        //this(45);
    }

    public Persona(int edad){
        this("Carolina");
        this.edad = edad;
    }
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 56;
        this.dni = 12345678;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public static int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public final boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public void printConstantes(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args){
/*
        new Persona().printConstantes();
        System.out.println(new Persona().dni);
        System.out.println(new Persona().nombre);
        //this.edad = 67; //this no puede ser referenciado desde un contexto statico

        System.err.println("coso coso!!!");
*/
    }
}
