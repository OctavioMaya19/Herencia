package entidades;

public class BarcoMotor extends Barco {
    private int CV;

    public BarcoMotor() {
    }

    public BarcoMotor(int CV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }
    
}
