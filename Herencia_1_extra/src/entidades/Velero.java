package entidades;

public class Velero extends Barco {
    private int numMastil;

    public Velero() {
    }

    public Velero(int numMastil, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastil = numMastil;
    }

    public int getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(int numMastil) {
        this.numMastil = numMastil;
    }
    
}
