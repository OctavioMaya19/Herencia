package entidades;

public class Yate extends Barco {
    private int CV;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int CV, int numCamarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
        this.numCamarotes = numCamarotes;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
}
