// una clase abstarcta es aquelal que contine
// al menos un metodo abstarcto
// Las clases abrtactas no se pueden instanciar
// Contienen mienbros abstractos y no abstractos
// El proposito de un clase abstacta es heredar a otras

public abstract class Empleado extends Persona {


    double salario;
    String nss;
    String rfc;

    public Empleado() {
    }


    public Empleado(String nombre, String direccion, int edad) {
        super(nombre, direccion, edad);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", nss='" + nss + '\'' +
                ", rfc='" + rfc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }

// metodo abstracto  (no tiene cuerpo)

    public abstract void trabajar();


}
