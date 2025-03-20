public class Cargador {

    String marca ;
    String color;
    String salida;  //TipoC, TipoA, microUSB
    double watts; //potencia
    double amp ; // intencidad

    public  Cargador(){}


    public Cargador(String marca, String salida, String color, double watts, double amp) {
        this.marca = marca;
        this.salida = salida;
        this.color = color;
        this.watts = watts;
        this.amp = amp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    //String
    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public double getAmp() {
        return amp;
    }

    public void setAmp(double amp) {
        this.amp = amp;
    }

    @Override
    public String toString() {
        return "Cargador{" +
                "marca='" + getMarca() + '\'' +
                ", color='" + getColor() + '\'' +
                ", salida='" + getSalida() + '\'' +
                ", watts=" + getWatts() +
                ", amp=" + getAmp() +
                '}';
    }
}