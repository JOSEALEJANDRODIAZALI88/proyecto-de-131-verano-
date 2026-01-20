package clases;

public class NodoZona {
    private Zona z;
    private NodoZona sig;
    private NodoZona ant;
   
    public NodoZona() {
        this.sig = null;
        this.ant = null;
    }

    public Zona getZ() {
        return z;
    }

    public void setZ(Zona z) {
        this.z = z;
    }

    public NodoZona getSig() {
        return sig;
    }

    public void setSig(NodoZona sig) {
        this.sig = sig;
    }

    public NodoZona getAnt() {
        return ant;
    }

    public void setAnt(NodoZona ant) {
        this.ant = ant;
    }        		
}
