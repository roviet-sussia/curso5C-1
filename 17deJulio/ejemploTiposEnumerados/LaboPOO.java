package ejemploTiposEnumerados;


public class LaboPOO {
    Dia dia1;
    Dia dia2;

    public LaboPOO(){
        dia1 = Dia.LUNES;
        dia2 = Dia.MIERCOLES;
    }

    public void setDia1(Dia dia1) {
        this.dia1 = dia1;
    }

    public void setDia2(Dia dia2) {
        this.dia2 = dia2;
    }

    public Dia getDia1() {
        return dia1;
    }

    public Dia getDia2() {
        return dia2;
    }
}
