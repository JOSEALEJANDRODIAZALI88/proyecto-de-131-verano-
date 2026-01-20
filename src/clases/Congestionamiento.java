package clases;

import java.util.Scanner;

public class Congestionamiento {
    private LD_NormalVia t;
    private String ubicacion, hora, fecha;

    public Congestionamiento(LD_NormalVia t, String ubicacion, String hora, String fecha) {
        this.t = t;
        this.ubicacion = ubicacion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public Congestionamiento() {
        this.t = null;
        this.ubicacion = "";
        this.hora = "";
        this.fecha = "";
    }
    
    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese los datos de congestionamiento (Lista Via, ubi., hora y fecha:):");
        this.t.leer1(1);
        this.ubicacion = lee.next();
        this.hora = lee.next();
        this.fecha = lee.next();                
    }
    	
    public void mostrar() {        
        System.out.println("=================================================");            
        System.out.println(t.getP().getX().getNombre());
        System.out.println("Ubicacion: "+ubicacion);
        System.out.println("Hora: "+hora);
        System.out.println("Fecha: "+fecha+"\n");        
    }
    public LD_NormalVia getT() {
        return t;
    }
    public void setT(LD_NormalVia t ) {
        this.t = t;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
	
}
