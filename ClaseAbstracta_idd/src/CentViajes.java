public abstract class CentViajes {

    double precio;
    String destino;
    int duracion;
    public CentViajes (){}

    public CentViajes(double precio, String destino, int duracion) {
        this.precio = precio;
        this.destino = destino;
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "CentViajes{" +
                "precio=" + getPrecio() +
                ", destino='" + getDestino() + '\'' +
                ", duracion=" + getDuracion() +
                '}';
    }
    public abstract void venderBoletoFisico ();
    public abstract void venderBoletoOnline ();
}
