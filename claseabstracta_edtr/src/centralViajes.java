public abstract class centralViajes {
    String salida;
    String linea;
    double precio;

    public centralViajes(){}

    public centralViajes(String salida, String linea, double precio) {
        this.salida = salida;
        this.linea = linea;
        this.precio = precio;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CentralViajes{" +
                "salida='" + salida + '\'' +
                ", linea=" + linea + '\'' +
                ", precio=" + precio +
                '}';
    }
    public abstract void venderBoletoFisico(int asciento, String tipoDePago);
    public abstract void venderBoletoOnline(String tarjeta, int asciento);
}
