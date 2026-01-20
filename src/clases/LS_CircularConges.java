package clases;

public class LS_CircularConges extends ListaSimpleConges{
    public LS_CircularConges() {
        super();
    }

    public boolean esVacia() {
        if(P == null)
            return true;
        return false;
    }

    public int nroNodos() {
        int c = 0;
        if(P != null) {
            NodoC R = P;
            while(R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;
        }
        return c;
    }
    public void adiFinal(Congestionamiento c) {
        NodoC nuevo = new NodoC();		
        nuevo.setC(c);
        if(P == null) {
            P = nuevo;
            P.setSig(P);
        }
        else {
            NodoC R = P;
            while( R.getSig() != P){
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Congestionamiento c) {
        NodoC nuevo = new NodoC();
        nuevo.setC(c);
        if(P == null) {
            P = nuevo;
            P.setSig(P);
        }else {
            NodoC R = P;
            while(R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
        NodoC R = P;
        System.out.println("LISTA DE CONGESTIONAMIENTOS:");
        while(R.getSig() != P) {
            R.getC().mostrar();
            R = R.getSig();
        }
        R.getC().mostrar();
    }

    public NodoC eliPrincipio() {
        NodoC x = null;    
        if(!esVacia()) {
            if(P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            }else {
                x = P ;
                NodoC R = P;
                while(R.getSig() != P) {
                    R = R.getSig();
                }
                P = P.getSig();
                R.setSig(P);
                x.setSig(null);
            }
        }
        return x;
    }

    public NodoC eliFinal() {
        NodoC x = new NodoC();
        if(P != null) {
            if(P.getSig() == P) {
                x = P; 
                x.setSig(null);
                P = null;
            }else {
                NodoC S = new NodoC();
                NodoC R = P;
                while(R.getSig() != P) {
                    S = R;
                    R = R.getSig();
                }
                x = R;
                x.setSig(null);
                S.setSig(P);
            }
        }
        return x;
    }

    public void llenar1(int n) {		
        for (int i = 1; i <= n; i++) {						
            Congestionamiento z = new Congestionamiento();
            z.leer();
            adiPrincipio(z);
        }
    }

    public void llenar2(int n) {		
        for (int i = 1; i <= n; i++) {						
            Congestionamiento z = new Congestionamiento();
            z.leer();
            adiFinal(z);
        }
    }
}
