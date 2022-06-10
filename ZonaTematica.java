package com.company;

import java.util.ArrayList;

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;
    private ArrayList<Espectaculo> espectaculo;
    private ArrayList<Restaurante> restaurante;
    private ArrayList<Atraccion> atraccion;

    public ZonaTematica(String nombre, String descripcion, String color, ArrayList<Espectaculo> espectaculo, ArrayList<Restaurante> restaurante, ArrayList<Atraccion> atraccion) throws InvalidparamException  {
        validate(nombre, descripcion, color);
        if(espectaculo==null) throw new InvalidparamException("espetaculo no puede ser null");
        this.espectaculo = espectaculo;
        if (espectaculo.isEmpty())throw new InvalidparamException("el espetaculo no tiene que esta vacio");
        if (restaurante==null)throw new InvalidparamException("el restaurate no puede ser null");
        this.restaurante = restaurante;
        if (restaurante.isEmpty())throw new InvalidparamException("el restaurante no tiene que esta vacio");
        if(atraccion== null) throw new InvalidparamException("la atracion no puede se null");
        if(atraccion.isEmpty())throw new InvalidparamException("la atraccion no tiene que esta vacia ");
        this.atraccion = atraccion;


    }
    public ZonaTematica(String nombre, String descripcion, String color, Restaurante restaurante, Atraccion atraccion, Espectaculo espectaculo) throws InvalidparamException {
        validate(nombre, descripcion, color);
        if (espectaculo == null) throw new InvalidparamException("espetaculo no puede ser null");
        this.espectaculo = new ArrayList<>();
        this.espectaculo.add(espectaculo);
        if (restaurante == null) throw new InvalidparamException("el restaurate no puede ser null");
        this.restaurante = new ArrayList<>();
        this.restaurante.add(restaurante);
        if (atraccion == null) throw new InvalidparamException("atracion es null");
        this.atraccion = new ArrayList<>();
        this.atraccion.add(atraccion);
    }



    private void validate(String nombre, String descripcion, String color) throws InvalidparamException {
        if(nombre ==null) throw new InvalidparamException("el nombre no puede se null");
        this.nombre = nombre;
        if( descripcion ==null) throw new InvalidparamException("la descricion no es null");
        this.descripcion = descripcion;
        if (color ==null)throw new InvalidparamException("el color puede ser null");
        this.color = color;
    }

}



