package Service;

import entidades.Alquiler;

public interface AlquilerInterface {
    public void crearAquiler(Alquiler alquiler);
    public int diasDeAlquiler(Alquiler alquiler);
    public double calculaAlquiler(Alquiler alquiler);
    
}
