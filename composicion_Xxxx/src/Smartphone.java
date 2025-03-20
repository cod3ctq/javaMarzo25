import java.util.Arrays;

public class Smartphone extends Celular{

    String modelo;
    String sistemaOperativo;

    //Composicion
    Camara[] cams;
    Procesador proc;

    //camara: resolucion, #c, zoom, aperF, distF, valorISO
    //conectividad : wifi, bluetooth, gps, 3g, 4g, 5g, NFC
    //display : tamaño, hz, ppi, resolucion,tipoPanel,
    //memoria  :capacidad, tipo,
    //procesador : frab, #nuc, frecuencia

    public Smartphone(){}


    public Smartphone(String fabricante, String material, String color, double mAh, String modelo, String sistemaOperativo, Camara[] cams, Procesador proc) {
        super(fabricante, material, color, mAh);
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.cams = cams;
        this.proc = proc;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Camara[] getCams() {
        return cams;
    }

    public void setCams(Camara[] cams) {
        this.cams = cams;
    }

    public Procesador getProc() {
        return proc;
    }

    public void setProc(Procesador proc) {
        this.proc = proc;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", cams=" + Arrays.toString(cams) +
                ", proc=" + proc +
                ", fabricante='" + fabricante + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", mAh=" + mAh +
                '}';
    }
}
