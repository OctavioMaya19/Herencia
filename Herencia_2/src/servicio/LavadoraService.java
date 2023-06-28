package servicio;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticosService {
    
    public Lavadora crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electro = crearElectrodomestico();
        Lavadora lavadora = new Lavadora();
        lavadora.setPrecio(electro.getPrecio());
        lavadora.setColor(electro.getColor());
        lavadora.setConsumo(electro.getConsumo());
        lavadora.setPeso(electro.getPeso());
        
        System.out.println("ingrese la carga de la lavadora");
        lavadora.setCarga(leer.nextInt());
        
        precioFinal(lavadora);
        return lavadora;
    }
    
    public void precioFinal(Lavadora lavadora){
        super.comprobarConsumoEnergetico(lavadora.getConsumo());
        super.comprobarColor(lavadora.getColor());
        super.precioFinal(lavadora);
        
        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 100);
        }
        System.out.println(lavadora.getPrecio());
    }
    
}
