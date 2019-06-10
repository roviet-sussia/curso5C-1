package superClases;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String nombre){
        //super(nombre);
    }

    public Estudiante(){
        super(13);
    }

    public void setEdad(int edad){
        super.setEdad(edad);
    }

    public void setDni(int dni){
        super.dni = dni;
    }

    public int getEdad(){
        return super.getEdad();
    }

    public static void main(String[] args){
        Estudiante e = new Estudiante("coso");
        int elDni = e.dni;
        System.out.println(e.getEdad());
    }
}
