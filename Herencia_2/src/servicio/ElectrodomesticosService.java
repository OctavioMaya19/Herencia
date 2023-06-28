package servicio;

import entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticosService {
    
    public char comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }else{
            return 'F';
        }
    }
    
    public String comprobarColor(String color){
        
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris")) {
            return color;
        }else{
            return "blanco";
        }
    }
    
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese el precio del producto");
        double precio = leer.nextDouble();
        System.out.println("ingrese el color del producto (blanco, negro, azul, rojo, gris)");
        String color = leer.next();
        System.out.println("ingrese el consumo del producto (de A a F)");
        char consumo = leer.next().charAt(0);
        System.out.println("ingrese el peso del producto");
        int peso = leer.nextInt();
        
        return new Electrodomestico(precio, color, consumo, peso);
    }
    
/*LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000*/
    public double precioFinal(Electrodomestico elec){
        switch(elec.getConsumo()){
            case 'A':
                elec.setPrecio(elec.getPrecio() + 1000);
                break;
            case 'B':
                elec.setPrecio(elec.getPrecio() + 800);
                break;
            case 'C':
                elec.setPrecio(elec.getPrecio() + 600);
                break;
            case 'D':
                elec.setPrecio(elec.getPrecio() + 500);
                break;
            case 'E':
                elec.setPrecio(elec.getPrecio() + 300);
                break;
            case 'F':
                elec.setPrecio(elec.getPrecio() + 100);
                break;
        }
        
        if (elec.getPeso() >= 1 && elec.getPeso() <= 19) {
            elec.setPrecio(elec.getPrecio() + 100);
        }else if (elec.getPeso() >= 20 && elec.getPeso() <= 49){
            elec.setPrecio(elec.getPrecio() + 500);
        }else if (elec.getPeso() >= 50 && elec.getPeso() <= 79){
            elec.setPrecio(elec.getPrecio() + 800);
        }else if (elec.getPeso() >= 80){
            elec.setPrecio(elec.getPrecio() + 1000);
        }
        
        return elec.getPrecio();
    }

}
