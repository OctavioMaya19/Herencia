package main;

import entidad.Edificio;
import entidad.EdificioOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;

public class Herencia_2_extra {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        
        Polideportivo poli1 = new Polideportivo();
        poli1.crearPoli();
        Polideportivo poli2 = new Polideportivo();
        poli2.crearPoli();
        EdificioOficinas oficina1 = new EdificioOficinas();
        oficina1.crearEdificioOficinas();
        EdificioOficinas oficina2 = new EdificioOficinas();
        oficina2.crearEdificioOficinas();
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(oficina1);
        edificios.add(oficina2);
        int contA = 0;
        int contT = 0;
        if (poli1.getInstalacion() == poli1.getInstalacion().ABIERTO) {
            contA++;
        }
        if (poli2.getInstalacion() == poli1.getInstalacion().ABIERTO) {
            contA++;
        }
        if (poli1.getInstalacion() == poli1.getInstalacion().TECHADO) {
            contT++;
        }
        if (poli2.getInstalacion() == poli1.getInstalacion().TECHADO) {
            contT++;
        }
        System.out.println("hay " + contT + " polideportivo/s techado/s");
        System.out.println("hay " + contA + " polideportivo/s abierto/s");
        System.out.println("en el primer edificio hay una cantidad de " + oficina1.cantPersonas() + " personas");
        System.out.println("en el segundo edificio hay una cantidad de " + oficina2.cantPersonas() + " personas");
    }

}
