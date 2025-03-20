public class Tapo extends centralViajes {

    @Override
    public void venderBoletoFisico(int asciento, String tipoDePago) {
        System.out.println("Comprar en ventanilla");
        System.out.println("Selecciona el tipo de pago (tarjeta o efectivo): " + tipoDePago);
        System.out.println("Selecciona el asciento: " + asciento);
    }

    @Override
    public void venderBoletoOnline(String tarjeta, int asciento) {
        System.out.println("Plataforma de viajes");
        System.out.println("Ingresa el número de tu tarjeta: "+tarjeta);
        System.out.println("Selecciona el asciento: " + asciento);
    }
}