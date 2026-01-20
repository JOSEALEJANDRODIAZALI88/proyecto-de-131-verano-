package clases;
public class ColaSemaforo extends VectorSemaforo {
    protected int fr;
    protected int fi;

    public ColaSemaforo() {
	this.fr = -1;
        this.fi = -1;
    }
}