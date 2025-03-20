public class Aeropuerto extends CentralViajes{


    @Override
    public void vendeBoletoFisico(int KmRecorrido, String Ubicacion) {
        System.out.println("EL presio en ventanilla a "+Ubicacion+" es de "+(KmRecorrido*3)+ " con una distancia de "+KmRecorrido+" Km con salida de Aeropuerto");

    }

    @Override
    public void venderBoletoOnline(int KmRecorrido, String Ubicacion, String Tarjeta) {
        System.out.println("EL precio online con tarjeta de "+Tarjeta+" y ubicacion "+Ubicacion+" es de "+(KmRecorrido*10)+ " con una distancia de "+KmRecorrido+" Km con salida de Aeropueto");
    }
}
