//Una clase abstracta es aquella que contiene al menos un metodo abstracto.
//Las clases abstractas NO se pueden instanciar
//Contienen miembros abstractos y NO abstractos.
//El proposito de una clase abstracta es heredar a otras.

public abstract class Empleado extends Persona{

    double salario;
    String nss;
    String rfc;

    public Empleado(){}

    public Empleado(String nombre, String direccion, int edad, double salario, String nss, String rfc) {
        super(nombre, direccion, edad);
        this.salario = salario;
        this.nss = nss;
        this.rfc = rfc;
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

    //metodo abstracto (no concreto)
    public abstract void trabajar();
}
