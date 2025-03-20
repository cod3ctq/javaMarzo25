abstract class CentralViajes {
    int venderBoletosFisicos;
    int venderBoletosOnline;

    public CentralViajes(int venderBoletosFisicos, int venderBoletosOnline) {
        this.venderBoletosFisicos = venderBoletosFisicos;
        this.venderBoletosOnline = venderBoletosOnline;
    }
    abstract void mostrarVentas();
}

class Capu extends CentralViajes {
    public Capu(int venderBoletosFisicos, int venderBoletosOnline) {
        super(venderBoletosFisicos, venderBoletosOnline);
    }

    @Override
    void mostrarVentas() {
        System.out.println("CAPU - Ventas Físicas: " + venderBoletosFisicos + ", Ventas Online: " + venderBoletosOnline);
    }
}

class Aeropuerto extends CentralViajes {
    public Aeropuerto(int venderBoletosFisicos, int venderBoletosOnline) {
        super(venderBoletosFisicos, venderBoletosOnline);
    }

    @Override
    void mostrarVentas() {
        System.out.println("AEROPUERTO - Ventas Físicas: " + venderBoletosFisicos + ", Ventas Online: " + venderBoletosOnline);
    }
}

public class Main {
    public static void main(String[] args) {
        CentralViajes capu = new Capu(150, 300);
        CentralViajes aeropuerto = new Aeropuerto(100, 500);

        capu.mostrarVentas();
        aeropuerto.mostrarVentas();
    }
}
