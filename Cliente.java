package com.company;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Ticket> ticket;

    public Cliente(String nombre, String apellido, ArrayList<Ticket> ticket) throws InvalidparamException{
        validate(nombre, apellido);
        if (ticket==null)throw new InvalidparamException("ticket es null");
        if (ticket.isEmpty()) throw new InvalidparamException("al meno una entrada");
        this.ticket = ticket;

    }


    public Cliente(String nombre, String apellido,Ticket ticket ) throws InvalidparamException {
        validate(nombre, apellido);
        if (ticket==null)throw new InvalidparamException("ticket es igual a null");
        this.ticket=new ArrayList<>();
        this.ticket.add(ticket);


    }




    private void validate(String nombre, String apellido) throws InvalidparamException {
        if(nombre ==null)throw new InvalidparamException("el nombre va hacer null");
        this.nombre = nombre;
        if (apellido == null) throw new InvalidparamException("el apellido es null");
        this.apellido = apellido;

    }

}


