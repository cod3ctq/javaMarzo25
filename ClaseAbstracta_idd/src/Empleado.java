//una clase abstracta es aquella que contiene
//almenos un metodo abtracto.

//Las clases abtractas no se pueden instanciar
//contienen miembros abstractos y No abstractos
//El proposito de una clase abstracta es heredar a otras

public abstract class  Empleado extends Persona{

    Double salario;
    String nss;
    String rrc;
    public Empleado (){}

    public Empleado(String nombre, String direccion, int edad, Double salario, String nss, String rrc) {
        super(nombre, direccion, edad);
        this.salario = salario;
        this.nss = nss;
        this.rrc = rrc;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getRrc() {
        return rrc;
    }

    public void setRrc(String rrc) {
        this.rrc = rrc;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + getSalario() +
                ", nss='" + getNss() + '\'' +
                ", rrc='" + getRrc() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", direccion='" + getDireccion() + '\'' +
                '}';
    }
    //metodo oabstracto
    public abstract void trabajar();
}
