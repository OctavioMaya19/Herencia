package entidad;

import enums.TipoInstalacion;
import java.util.Scanner;

public class Polideportivo extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private TipoInstalacion instalacion;

    public Polideportivo(String nombre, TipoInstalacion instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(TipoInstalacion instalacion) {
        this.instalacion = instalacion;
    }
    
    public void crearPoli(){
        System.out.println("ingrese el nombre del polideportivo");
        this.nombre = leer.next();
        System.out.println("seleccione una opcion");
        System.out.println("1_ techado");
        System.out.println("2_ abierto");
        int opcion = leer.nextInt() - 1;
        this.instalacion = TipoInstalacion.values()[opcion];
        System.out.println("ingrese los siguientes parametros en metros");
        System.out.print("ancho : ");
        this.ancho = leer.nextDouble();
        System.out.print("largo : ");
        this.largo = leer.nextDouble();
        System.out.print("alto : ");
        this.alto = leer.nextDouble();
        calcularSuperficie();
        calcularVolumen();
    }
    
    @Override
    public double calcularSuperficie() {
        double baseArea = (this.getAncho() * 2) + (this.getLargo() * 2);
        return baseArea + (2 * this.getAlto() * 4);
    }

    @Override
    public double calcularVolumen() {
        return this.getAncho() * this.getLargo() * this.getAlto();
    }

}
