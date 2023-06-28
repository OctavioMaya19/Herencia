package Service;

import entidades.Alquiler;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class AlquilerService implements AlquilerInterface {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  /*Para cada Alquiler se guarda: el
    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    amarre y el barco que lo ocupará.*/
    @Override
    public void crearAquiler(Alquiler alquiler) {
        System.out.println("ingrese el nombre del cliente");
        alquiler.setNombre(leer.next());
        System.out.println("ingrese el numero de documento");
        alquiler.setDocumento(leer.nextInt());
        System.out.println("ingrese la fecha de alquiler");
        alquiler.setFechaAlquiler(LocalDate.now());
        System.out.println("ingrese la fecha de devolucion");
        System.out.print("dia: ");
        int dia = leer.nextInt();
        System.out.print("mes: ");
        int mes = leer.nextInt();
        System.out.print("año: ");
        int anio = leer.nextInt();
        alquiler.setFechaDevolucion(LocalDate.of(anio, mes, dia));
        System.out.println("ingrese la posicion del amarre");
        alquiler.setPocicionAmarre(leer.nextInt());
        System.out.println("ingrese la matricula del barco");
        String matricula = leer.next();
        System.out.println("ingrese la eslora");
        int eslora = leer.nextInt();
        System.out.println("ingrese el año de fabricacion");
        int anioFabricacion = leer.nextInt();
        
        boolean valida = false;
        do {
            System.out.println("seleccione el barco que posee");
            System.out.println("1_ Velero");
            System.out.println("2_ Barco a motor");
            System.out.println("3_ Yate de lujo");
            int opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("ingrese el numero de mastiles de del velero");
                    int mastil = leer.nextInt();
                    alquiler.setBarco(new Velero(mastil, matricula, eslora, anioFabricacion));
                    break;
                case 2:
                    System.out.println("ingrese los CV del barco a motor");
                    int CV = leer.nextInt();
                    alquiler.setBarco(new BarcoMotor(CV, matricula, eslora, anioFabricacion));
                    break;
                case 3:
                    System.out.println("ingrese los CV del yate");
                    int CVY = leer.nextInt();
                    System.out.println("ingrese la cantidad de camarotes del yate");
                    int numCamarotes = leer.nextInt();
                    alquiler.setBarco(new Yate(CVY, numCamarotes, matricula, eslora, anioFabricacion));
                    break;
                default:    
                    System.out.println("ingrese una opcion valida");
                    valida = true;
            }
            
        } while (valida);
        System.out.println("el precio del alquiler es de : " + calculaAlquiler(alquiler));
    }

    @Override
    public int diasDeAlquiler(Alquiler alquiler) {
        int diasAlquiler = alquiler.getFechaDevolucion().getDayOfMonth() - alquiler.getFechaAlquiler().getDayOfMonth();
        return (diasAlquiler);
    }

    @Override
    public double calculaAlquiler(Alquiler alquiler) {
        int dias = diasDeAlquiler(alquiler);
        double alquilerTotal = 0;
        if (alquiler.getBarco() instanceof Velero ) {
            Velero barcoV = (Velero) alquiler.getBarco();
            alquilerTotal = dias * (barcoV.getNumMastil() + barcoV.getEslora()) * 10;
        }else if (alquiler.getBarco() instanceof BarcoMotor) {
            BarcoMotor barcoM = (BarcoMotor) alquiler.getBarco();
            alquilerTotal = dias * (barcoM.getCV() + barcoM.getEslora()) * 10; 
        }else if (alquiler.getBarco() instanceof Yate) {
            Yate barcoY = (Yate) alquiler.getBarco();
            alquilerTotal = dias * (barcoY.getCV() + barcoY.getNumCamarotes() + barcoY.getEslora()) * 10;
        }
        return alquilerTotal;
    }
    
}
