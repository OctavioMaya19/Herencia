package entidad;

import enums.TipoInstalacion;
import java.util.Scanner;

public class EdificioOficinas extends Edificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numOficinas;
    private int cantPersonas;
    private int numDePisos;

    public EdificioOficinas(int numOficinas, int cantPersonas, int numDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numDePisos = numDePisos;
    }

    public EdificioOficinas() {
    }

    public void crearEdificioOficinas() {
        System.out.println("ingrese el numero de oficinas por piso");
        this.numOficinas = leer.nextInt();
        System.out.println("ingrese la cantidad de personas por oficinas");
        this.cantPersonas = leer.nextInt();
        System.out.println("ingrese el numero de pisos del edificio");
        this.numDePisos = leer.nextInt();
        System.out.println("ingrese los siguientes parametros en metros");
        System.out.print("ancho : ");
        this.ancho = leer.nextDouble();
        System.out.print("largo : ");
        this.largo = leer.nextDouble();
        System.out.print("alto : ");
        this.alto = leer.nextDouble();
        calcularSuperficie();
        calcularVolumen(); 
        cantPersonas();
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

    public int cantPersonas() {
        return this.cantPersonas * this.numOficinas * this.numDePisos;
    }
}
