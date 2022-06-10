package com.company;

public class Atraccion{
    private String nombre;
    private int estatura;
    private int Capacidad;
    private int duracion;

    public Atraccion(String nombre, int estatura, int capacidad, int duracion)throws InvalidparamException {
        if (nombre==null)throw new  InvalidparamException("el nombre es null");
        this.nombre = nombre;
        if (estatura<=1)throw new InvalidparamException("estatura es menor a 1");
        this.estatura = estatura;
        if (capacidad<=20) throw new InvalidparamException("la capacidad es menor a 20");
        this.Capacidad = capacidad;
        if (duracion <=2)throw new InvalidparamException("la duracion no puede ser menor ");
        this.duracion = duracion;
    }





}
