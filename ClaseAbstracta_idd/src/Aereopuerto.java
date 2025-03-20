import java.util.Scanner;

public class Aereopuerto extends CentViajes{
   String aereolinea;


    @Override
    public void venderBoletoFisico() {
        System.out.println("El pago en efect, tiene 200$ de descuento" +
                "por el primer viaje y el segundo vuelo el precio es el mismo");


    }

    @Override
    public void venderBoletoOnline() {
        System.out.println("El pago online tiene un 15% de descuentoen el primer vuelo" +
                "y el segundo vuelo un 25% de descuento al pagar con tarj.Credito");

    }
}
