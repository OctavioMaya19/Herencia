package main;

import entidades.Electrodomestico;
import servicio.LavadoraService;
import servicio.TelevisorService;

public class Herencia_2 {

    public static void main(String[] args) {
        TelevisorService tele = new TelevisorService();
        LavadoraService lavadora = new LavadoraService();
        
        Electrodomestico elec = lavadora.crearLavadora();
        System.out.println(lavadora.precioFinal(elec));
        
        Electrodomestico elect = tele.crearTelevisor();
        System.out.println(tele.precioFinal(elect));
    }
    
}
