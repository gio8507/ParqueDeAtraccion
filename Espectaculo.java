package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Espectaculo {
    private String nombre;
    private String TipoEspectaculo;
    private int minutos;
    private ArrayList<Pase> Pase;

    public Espectaculo(String nombre, String tipoEspectaculo, int minutos, ArrayList<Pase> pase) {
        validate(nombre, tipoEspectaculo, minutos);
        if(pase!=null)
        this.Pase = pase;
    }
    public Espectaculo(String nombre, String tipoEspectaculo, int minutos) {
        validate(nombre, tipoEspectaculo, minutos);


    }
    public Espectaculo(String nombre, String tipoEspectaculo, int minutos, Pase pase) {
        validate(nombre, tipoEspectaculo, minutos);
        this.Pase =new ArrayList<>();
        if(pase!=null)
            this.Pase.add(pase);
    }
    private void validate(String nombre, String tipoEspectaculo, int minutos) {
        if (nombre ==null)throw new InvalidParameterException("el nombre sera igual a null");
        this.nombre = nombre;
        if( tipoEspectaculo ==null) throw new InvalidParameterException("el tipo sera igual a null");
        TipoEspectaculo = tipoEspectaculo;
        if(minutos <=0) throw new InvalidParameterException("los minuto menor igual a 0");
        this.minutos = minutos;
    }



}





