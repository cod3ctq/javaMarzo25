public class Chef implements ISalud, IContaduria{
    String nombre;
    String especialidad;

    public Chef() {}

    public Chef(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public void cortarVejetales() {}
    public void freirComida() {}
    public void prepararMasa() {}

    //Metodos de la forma 3: implementados traidos de interfaces
    @Override
    public void inyectar() {

    }

    @Override
    public void checarPresion() {

    }

    @Override
    public void darPrimerosAuxilios() {

    }

    @Override
    public void curar() {

    }

    @Override
    public void diagnosticar() {

    }

    @Override
    public void contar() {

    }

    @Override
    public void hacerDeclaracion() {

    }

    @Override
    public void evadirImpuesto() {

    }
}
