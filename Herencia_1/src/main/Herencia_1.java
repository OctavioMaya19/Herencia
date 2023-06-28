package main;

import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Herencia_1 {

    public static void main(String[] args) {
        
        Perro perro1 = new Perro("peque", "alimento de perro", 3, "dogo");
        perro1.alimentarse();
        
        Perro perro2 = new Perro("Frida", "carne", 6, "mestizo");
        perro2.alimentarse();
        
        Gato gato = new Gato("india", "alimento de gato", 12 , "mestizo");
        gato.alimentarse();
        
        Caballo caballo = new Caballo("horse luis", "pasto", 8, "fino");
        caballo.alimentarse();
        
    }
    
}










