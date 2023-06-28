package entidades;

public class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean sincronizadorTDT;

    public Televisor() {
    }
    
    public Televisor(int pulgadas, boolean sincronizadorTDT, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = 0;
        this.sincronizadorTDT = false;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSincronizadorTDT() {
        return sincronizadorTDT;
    }

    public void setSincronizadorTDT(boolean sincronizadorTDT) {
        this.sincronizadorTDT = sincronizadorTDT;
    }
    
}
