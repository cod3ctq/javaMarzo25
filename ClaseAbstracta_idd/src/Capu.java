public class Capu extends CentViajes{
    @Override
    public void venderBoletoFisico() {

        System.out.println("Pago en efectivo en la estacion 1 no hay promociones");
        System.out.println("pago en efectivo en estacion 2 se ahorra 200$ si separa el boleto 10 dias antes");
    }

    @Override
    public void venderBoletoOnline() {
        System.out.println("promocion de 20% de descuento al pagar con tarjetas de credito");

    }
}
