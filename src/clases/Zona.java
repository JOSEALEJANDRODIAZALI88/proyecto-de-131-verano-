package clases;

import java.util.Scanner;

public class Zona {
    private String Nombre;
    private String Ubicacion;
    private LD_NormalVia r;

    public Zona() {
        this.Nombre = "";
        this.Ubicacion = "";
        this.r = null;
    }

    
    public Zona(String Nombre, String Ubicacion, LD_NormalVia r) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.r = r;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public LD_NormalVia getR() {
        return r;
    }

    public void setR(LD_NormalVia r) {
        this.r = r;
    }
    
    public void mostrar(){        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ZONA: "+Nombre);
        System.out.println("Ubicacion: "+Ubicacion);
        System.out.println("--------------------------------------------------------------------");
        r.mostrar();
        System.out.println("\n");
    }
    
    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Introducir Nombre, Ubicacion y lista Via:");
        this.Nombre = lee.next();
        this.Ubicacion = lee.next();
        r.leer1(1);        
    }
}
