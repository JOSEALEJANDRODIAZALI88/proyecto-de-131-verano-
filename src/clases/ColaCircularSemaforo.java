package clases;
import java.util.Scanner;

public class ColaCircularSemaforo extends ColaSemaforo{
    public ColaCircularSemaforo() {
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
    
    public void adi(Semaforo elem) {
        if(!esLlena()) {
            fi = (fi + 1) % MAX;
            v[fi] = elem;
        }
        else
            System.out.println("cola circular llena!!!");
    }
    
    public Semaforo eli() {
        Semaforo elem = null;
        if(!esVacia()) {
            fr = (fr + 1) % MAX;
            elem = v[fr];
        }
        else
            System.out.println("Cola circular vacia!!");
        return elem;
    }
	
    public void vaciar(ColaCircularSemaforo z) {
        while(!z.esVacia()) {
            adi(z.eli());
        }
    }
        
    
    public void llenar(int n) {
        Scanner lee = new Scanner(System.in);		
        for (int i = 1; i <= n; i++) {
            System.out.println("Intr. color y duracion del Semaforo:");
            String col = lee.next();
            int dur = lee.nextInt();           
            Semaforo elem = new Semaforo (col, dur);
            adi(elem);
        }
    }
    
        
    public void mostrar() {
        ColaCircularSemaforo aux = new ColaCircularSemaforo();
        while(!esVacia()) {
            Semaforo elem = eli();
            elem.mostrar();
            aux.adi(elem);
        }
        vaciar(aux);
    }
}