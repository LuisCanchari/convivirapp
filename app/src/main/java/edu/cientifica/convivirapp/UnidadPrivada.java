package edu.cientifica.convivirapp;

public class UnidadPrivada
{
    private int id;
    private int numero;
    private String propietario;
    private String tipo;

    public UnidadPrivada() {
    }

    public UnidadPrivada(int id, int numero, String propietario, String tipo) {
        this.id = id;
        this.numero = numero;
        this.propietario = propietario;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  tipo + " "+numero + " " +propietario;
    }
}
