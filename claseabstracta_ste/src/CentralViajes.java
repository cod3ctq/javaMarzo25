public abstract class CentralViajes {

    double ingresos;
    double egresos;
    int salidaEmergencia;


    public CentralViajes(){
    }

    public CentralViajes(double egresos, double ingresos, int salidaEmergencia) {
        this.egresos = egresos;
        this.ingresos = ingresos;
        this.salidaEmergencia = salidaEmergencia;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public int getSalidaEmergencia() {
        return salidaEmergencia;
    }

    public void setSalidaEmergencia(int salidaEmergencia) {
        this.salidaEmergencia = salidaEmergencia;
    }

    @Override
    public String toString() {
        return "CentralViajes{" +
                "ingresos=" + ingresos +
                ", egresos=" + egresos +
                ", salidaEmergencia=" + salidaEmergencia +
                '}';
    }



// metodo abstracto  (no tiene cuerpo)

    public abstract void vendeBoletoFisico(int KmRecorrido, String Ubicacion);

// metodo abstracto  (no tiene cuerpo)

    public abstract void venderBoletoOnline(int KmRecorrido, String Ubicacion, String Tarjet);



}
