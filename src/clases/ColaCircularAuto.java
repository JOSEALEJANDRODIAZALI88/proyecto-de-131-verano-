package clases;

import java.util.Scanner;


public class ColaCircularAuto extends ColaAuto{
    public ColaCircularAuto() {
        super();
    }
        
    public int nroElem() {
        return (fi - fr + MAX) % MAX;
    }
        
    public boolean esVacia() {
        if(nroElem() == 0)
            return true;
        return false;		
    }
        
    public boolean esLlena() {
        if(nroElem() == MAX-1)
            return true;
	return false;
    }
    
    public void adi(Auto elem) {
        if(!esLlena()) {
            fi = (fi + 1) % MAX;
            v[fi] = elem;
        }
        else
            System.out.println("cola circular llena!!!");
    }
    
    public Auto eli() {
        Auto elem = null;
        if(!esVacia()) {
            fr = (fr + 1) % MAX;
            elem = v[fr];
        }
        else
            System.out.println("Cola circular vacia!!");
        return elem;
    }
	
    public void vaciar(ColaCircularAuto z) {
        while(!z.esVacia()) {
            adi(z.eli());
        }
    }
    
    public void llenar(int n) {
        Scanner lee = new Scanner(System.in);		
        for (int i = 1; i <= n; i++) {
            System.out.println("Intr. matriculo, modelo, tipo y velocidad:");
            String a = lee.next();       
            String b = lee.next();       
            String c = lee.next();       
            int d = lee.nextInt();       
            Auto elem = new Auto(a,b,c,d);
            adi(elem);
        }
    }
    
    public void mostrar() {
        ColaCircularAuto aux = new ColaCircularAuto();
        while(!esVacia()) {
            Auto elem = eli();
            elem.mostrar();
            aux.adi(elem);
        }
        vaciar(aux);
    }
}