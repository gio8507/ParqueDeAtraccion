package com.company;

public class Restaurante {

    private String nombre;
    private String horario;
    private float precioMedio;

    public Restaurante(String nombre, String horario, float precioMedio)throws InvalidparamException  {
        if (nombre==null)throw new InvalidparamException("el nombre es null");
        this.nombre = nombre;
        if (horario==null)throw new InvalidparamException("el horario es null");
        this.horario= horario;
        if (precioMedio<=0) throw new InvalidparamException("el precio es menor a 0");
        this.precioMedio = precioMedio;

    }
}
