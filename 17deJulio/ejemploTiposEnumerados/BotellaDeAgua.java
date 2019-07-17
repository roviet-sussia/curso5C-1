package ejemploTiposEnumerados;

public enum BotellaDeAgua {

    CHIQUITA(250), MEDIANA(500), GRANDE(1000);

    private int cc;

    private BotellaDeAgua(int cc){
        this.cc = cc;
    }

    public int getCc(){
        return cc;
    }

}
