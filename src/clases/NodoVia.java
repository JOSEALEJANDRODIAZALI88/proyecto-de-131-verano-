package clases;

public class NodoVia {
    private Via x;
    private NodoVia sig;
    private NodoVia ant;
    public NodoVia() {
            sig = null;
            ant = null;
    }
    public Via getX() {
            return x;
    }
    public void setX(Via x) {
            this.x = x;
    }
    public NodoVia getSig() {
            return sig;
    }
    public void setSig(NodoVia sig) {
            this.sig = sig;
    }
    public NodoVia getAnt() {
            return ant;
    }
    public void setAnt(NodoVia ant) {
            this.ant = ant;
    }

}
