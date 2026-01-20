package clases;

public class NodoC {
    private Congestionamiento c;
    private NodoC sig;
    
    public NodoC(){
        sig = null;
    }

    public Congestionamiento getC() {
        return c;
    }

    public void setC(Congestionamiento c) {
        this.c = c;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
    
   
}
