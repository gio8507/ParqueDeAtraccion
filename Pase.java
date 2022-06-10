package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Pase {
    private LocalDate fecha;
    private LocalDate horarioInicio;
    private LocalDate horaFin;
    private ArrayList<Entrada> Entrada;

    

    public Pase(LocalDate fecha, LocalDate horarioInicio, LocalDate horaFin, ArrayList<Entrada> entrada) throws InvalidparamException {
        validate(fecha, horarioInicio, horaFin);
        if (entrada==null)throw new InvalidparamException("al menos una entrada");
        if(entrada.isEmpty())throw new InvalidparamException( "al menos una entrada");
        this.Entrada=entrada;


   }
    public Pase(LocalDate fecha, LocalDate horarioInicio, LocalDate horaFin, Entrada entrada) throws InvalidparamException {
        validate(fecha, horarioInicio, horaFin);
        if (entrada == null) throw new InvalidparamException("al menos una entrada");
        this.Entrada=new ArrayList<>();
        this.Entrada.add(entrada);
    }

    private void validate(LocalDate fecha, LocalDate horarioInicio, LocalDate horaFin) throws InvalidparamException {
        if (fecha == null)throw new InvalidparamException("fecha es null");
        this.fecha= fecha;
        if (horarioInicio ==null)throw new InvalidparamException("hora inicio es null");
        this.horarioInicio= horarioInicio;
        if (horaFin ==null)throw new InvalidparamException("hora fin es null");
        this.horaFin =horaFin;
        if (horarioInicio.isAfter(horaFin))throw new InvalidparamException("hora inicio no puede ser ");
    }


}










