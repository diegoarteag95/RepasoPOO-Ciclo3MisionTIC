package com.repaso.poo;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
    }
    public String NombresCompletos(){
        return getNombre() + " " + getApellido();
    }
}
