public class Capu extends CentralViajes {


    @Override
    public void vendeBoletoFisico(int KmRecorrido, String Ubicacion) {

        System.out.println("EL precio en ventanilla a "+Ubicacion+" es de "+(KmRecorrido*.5)+ " con una distancia de "+KmRecorrido+" Km con salida de Capu");



    }

    @Override
    public void venderBoletoOnline(int KmRecorrido, String Ubicacion, String Tarjeta) {
        System.out.println("EL precio online con tarjeta de "+Tarjeta+" y ubicacion "+Ubicacion+" es de "+(KmRecorrido*1)+ " con una distancia de "+KmRecorrido+" Km con salida de Capu");

    }




}
