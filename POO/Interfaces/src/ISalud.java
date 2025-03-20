/*
* Una interface es un contrato de acciones que las clases que la implementan deben obligatoriamente
* cumplir/resolver, no es un modelo, es un CONTRATO
*
* No tiene atributos, constructores, getter & Setters, solo debe haber metodos abstracto las interfaces
* son 100% publicas*/
//CÓMO se tiene que comportar

public interface ISalud {

    void inyectar();
    void checarPresion();
    void darPrimerosAuxilios();
    void curar();
    void diagnosticar();
}
