package clases;

public class LD_NormalVia extends ListaDobleVia {
    public LD_NormalVia() {
        super();
    }
    
    public boolean esVacia() {
        if(this.P == null)
                return true;
        return false;
    }
    
    public int nroNodos() {
        int c = 0;
        NodoVia R = this.P;
        while(R != null) {
            c++;
            R = R.getSig();
        }
        return c;
    }
    
    public void adiPrimero(Via z){
        NodoVia nuevo = new NodoVia();
        nuevo.setX(z);//nuevo.setProy(z);
        if(esVacia())
            P = nuevo;
        else {
            nuevo.setSig(P);
            P.setAnt(nuevo);
            P = nuevo;
        }
    }
    
    public void mostrar() {
        NodoVia R = P;
        while(R != null) {
            R.getX().mostrar();//R.getProy().mostrar();
            R = R.getSig();
        }
    }
    
    public void adiFinal(Via z) {
        NodoVia nuevo =  new NodoVia();
        nuevo.setX(z);
        if(esVacia())
            P = nuevo;
        else {
            NodoVia R = P;
            while(R.getSig() != null) {
                    R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setAnt(R);
        }
    }

    public NodoVia eliPrimero() {
        NodoVia x = new NodoVia();
        if(!esVacia()) {
            if(nroNodos() == 1) {
                x = P;
                P = null;
            }
            else {
                x = P;
                P = P.getSig();
                P.setAnt(null);
                x.setSig(null);
            }
        }
        return x;
    }

    public NodoVia eliFinal() {
        NodoVia x = new NodoVia();
        if(!esVacia()) {
            if(nroNodos() == 1) {
                x = P;
                P = null;
            }else {
                NodoVia R = P;
                while(R.getSig() != null) {
                    R = R.getSig();
                }
                x = R;
                NodoVia aux = R.getAnt();
                aux.setSig(null);
                x.setAnt(null);
            }
        }
        return x;
    }

    void leer1(int n) {
        for (int i = 1; i <= n; i++) {
            Via z = new Via();
            z.leer();
            adiPrimero(z);
        }
    }

    void leer2(int n) {
        for (int i = 1; i <= n; i++) {
            Via z = new Via();
            z.leer();
            adiFinal(z);
        }
    }
}
