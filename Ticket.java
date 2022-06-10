package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    private LocalDate fecha;
    private float precio;
    private ArrayList<Entrada>entrada;

    public Ticket(LocalDate fecha, float precio, ArrayList<Entrada> entrada) throws InvalidParameterException{
        validate(fecha, precio);
        if(entrada!=null)
        this.entrada = entrada;
    }
    public Ticket(int fecha, float precio) throws InvalidParameterException {
        validate(LocalDate.ofEpochDay(fecha), precio);
    }

    public Ticket(LocalDate fecha, float precio, Entrada entrada) throws InvalidParameterException {
        validate(fecha, precio);
        this.entrada = new ArrayList<>();
        if (entrada != null)
            this.entrada.add(entrada);
    }



    private void validate(LocalDate fecha, float precio) {
        if(fecha ==null)throw new InvalidParameterException("la fecha es null");
        this.fecha = fecha;
        if(precio <=0)throw new InvalidParameterException("el precio es menor a 0");
        this.precio = precio;
    }

    }





