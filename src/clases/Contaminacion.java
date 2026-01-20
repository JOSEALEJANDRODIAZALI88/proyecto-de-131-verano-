package clases;

public class Contaminacion {
    private Zona s;	
    private String Contaminantes, NivelContaminacion, CalidadAire;

    public Contaminacion(Zona s, String Contaminantes, String NivelContaminacion, String CalidadAire) {
        this.s = s;        
        this.Contaminantes = Contaminantes;
        this.NivelContaminacion = NivelContaminacion;
        this.CalidadAire = CalidadAire;
    }

    public Zona getS() {
        return s;
    }

    public void setS(Zona s) {
        this.s = s;
    }   

    public String getContaminantes() {
        return Contaminantes;
    }

    public void setContaminantes(String Contaminantes) {
        this.Contaminantes = Contaminantes;
    }

    public String getNivelContaminacion() {
        return NivelContaminacion;
    }

    public void setNivelContaminacion(String NivelContaminacion) {
        this.NivelContaminacion = NivelContaminacion;
    }

    public String getCalidadAire() {
        return CalidadAire;
    }

    public void setCalidadAire(String CalidadAire) {
        this.CalidadAire = CalidadAire;
    }
   
    public void mostrar(){
        System.out.println("*************************************************");
        System.out.print("Zona "+s.getNombre());
        System.out.println(" - "+s.getR().getP().getX().getNombre());
        System.out.println("Contaminantes: "+Contaminantes);
        System.out.println("Nivel contaminacion: "+NivelContaminacion);
        System.out.println("Calidad del aire: "+CalidadAire+"\n");                
    }
	
	
}
