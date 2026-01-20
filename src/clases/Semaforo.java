package clases;
public class Semaforo {
    private String color;
    private int duracion;
    

    public Semaforo(String color, int duracion) {
        this.color = color;
        this.duracion = duracion;
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
    @Override
    public String toString() {
        return "Semaforo{" + "color=" + color + ", duracion=" + duracion + '}';
    }
    
    public void mostrar(){
        System.out.println(toString());
    }

}
