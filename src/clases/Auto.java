package clases;
public class Auto {
    private String matricula;
    private String modelo;
    private String tipo;
    private int velocidad;

    public Auto(String matricula, String modelo, String tipo, int velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Auto{" + "matricula=" + matricula + ", modelo=" + modelo + ", tipo=" + tipo + ", velocidad=" + velocidad + '}';
    }

    public void mostrar(){
        System.out.println(toString());
    }
}
