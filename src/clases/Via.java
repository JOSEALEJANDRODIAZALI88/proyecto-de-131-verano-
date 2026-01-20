/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Via {
    private String nombre;
    private String tipo;
    private String ubicacion;
    private String estado;
    private int longitud;
    private int num_carriles;
    private ColaCircularSemaforo x;
    private ColaCircularAuto y;

    public Via() {
        this.nombre = "";
        this.tipo = "";
        this.ubicacion = "";
        this.estado = "";
        this.longitud = 0;
        this.num_carriles = 0;
        this.x = null;
        this.y = null;
    }
    
    

    public Via(String nombre, String tipo, String ubicacion, String estado, int longitud, int num_carriles, ColaCircularSemaforo x, ColaCircularAuto y) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.longitud = longitud;
        this.num_carriles = num_carriles;
        this.x = x;
        this.y = y;
    }   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNum_carriles() {
        return num_carriles;
    }

    public void setNum_carriles(int num_carriles) {
        this.num_carriles = num_carriles;
    }

    public ColaCircularSemaforo getX() {
        return x;
    }

    public void setX(ColaCircularSemaforo x) {
        this.x = x;
    }

    public ColaCircularAuto getY() {
        return y;
    }

    public void setY(ColaCircularAuto y) {
        this.y = y;
    }
    
    public void mostrar(){
        System.out.println("<- "+nombre+" --------------------------------------------------->");        
        System.out.println("Tipo: "+tipo);
        System.out.println("Ubicacion: "+ubicacion);
        System.out.println("Estado: "+estado);
        System.out.println("Longitud: "+longitud);
        System.out.println("Num. Carriles: "+num_carriles);
        x.mostrar();
        y.mostrar();
        System.out.println("<------------------------------------------------------------------>\n");
    }
    
    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese los datos de la via (nombre, tipo, ubicacion, estado, longitud, Num. Carriles, Cola Auto y Cola Semaforo):");
        this.nombre = lee.next();
        this.tipo = lee.next();
        this.ubicacion = lee.next();
        this.estado = lee.next();
        this.longitud = lee.nextInt();
        this.num_carriles = lee.nextInt();
        x.llenar(1);
        y.llenar(1);        
    }
}
