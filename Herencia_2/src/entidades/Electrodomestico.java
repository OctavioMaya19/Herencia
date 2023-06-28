package entidades;


public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = 0;
    }

    public Electrodomestico(double precio, String color, char consumo, int peso) {
        this.precio = 1000;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}