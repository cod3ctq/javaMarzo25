import java.util.Scanner;

public class Aeropuerto extends centralViajes{

    @Override
    public void venderBoletoFisico(int asciento, String tipoDePago) {
        System.out.println("Comprar en ventanilla");
        System.out.println("Selecciona el tipo de pago (tarjeta o efectivo): " + tipoDePago);
        System.out.println("Selecciona el asciento: " + asciento);
    }
//    Scanner sc= new Scanner(System.in);
//    String tarjeta= sc.next();
//    int asciento = sc.nextInt();

    @Override
    public void venderBoletoOnline(String tarjeta, int asciento) {
        System.out.println("Plataforma de viajes");
        System.out.println("Ingresa el número de tu tarjeta: " + tarjeta);
        System.out.println("Selecciona el asciento: " + asciento);
    }
}