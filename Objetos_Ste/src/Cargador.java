public class Cargador {


    String marca;
    String color;
    String salida; // TipoC , Tipo A, microUSB
    double watts;  //Potencia
    double amp;   // Intensidad
public Cargador(){}

    public Cargador(String marca, String color, String salida, double watts, double amp) {
        this.marca = marca;
        this.color = color;
        this.salida = salida;
        this.watts = watts;
        this.amp = amp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

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
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", salida='" + salida + '\'' +
                ", watts=" + watts +
                ", amp=" + amp +
                '}';
    }



}
