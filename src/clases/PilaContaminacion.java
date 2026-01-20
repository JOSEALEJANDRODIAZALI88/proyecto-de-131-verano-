package clases;
import java.util.Scanner;

public class PilaContaminacion extends VectorContaminacion{
    private int tope;

    public PilaContaminacion() {
    	this.tope = -1;
    }
    
    public boolean esVacia(){
	if(this.tope == -1)
            return true;  
        else
            return false;
    }
    
    public boolean esLlena(){
        if(this.tope == max-1)
            return true; 
	else 
            return false;
    }
    
    public void adi(Contaminacion elem){
        if(!esLlena()){ 
            this.tope++;
            this.v[this.tope] = elem;
	}
	else
            System.out.println("Pila Llena!!!");
    }
    
    public Contaminacion eli(){
	Contaminacion elem = new Contaminacion(null, "", "", "");
	if(!esVacia()){ 
            elem = this.v[this.tope];
            this.tope--;
	}
	else
            System.out.println("Pila es vacia!!!!");
	return elem;
    }
	
    public void mostrar(){
	PilaContaminacion aux = new PilaContaminacion();
	System.out.println("PILA DE CONTAMINACIONES:");
	while(!esVacia()){
            Contaminacion elem = eli();
            //System.out.println(elem);
            elem.mostrar();
            aux.adi(elem);
	} 
	vaciar(aux);
    }
    
    public void vaciar(PilaContaminacion p){
        while(!p.esVacia()){
            this.adi(p.eli());
	}
    }
    
    public void llenar(int n){
	Scanner lee = new Scanner(System.in);
	System.out.println("Intr. Zona, Contaminacion, nivelCont. y la Calidad del aire:");
        for (int i = 1; i <= n; i++) {
            Zona x = null;
            String a = lee.next();
            String b = lee.next();					
            String c = lee.next();
            Contaminacion elem = new Contaminacion(x,a,b,c);            
            this.adi(elem);
	}
    }
    
    public int nroElem(){
	return tope + 1;
    }
}
