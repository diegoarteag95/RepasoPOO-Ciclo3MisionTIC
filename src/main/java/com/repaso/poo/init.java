package com.repaso.poo;

public class init {
    public static void main(String[] args) {
        //crear instancia de clase zapato
        Zapato miPrimerZapato = new Zapato();
        miPrimerZapato.setColor("Negro");
        miPrimerZapato.setMarca("Brahama");
        miPrimerZapato.setTalla(42);

        //crear instancia de clase estudiante
        Estudiante estudiante1 = new Estudiante("Diego", "Valencia");
        System.out.println(estudiante1.NombresCompletos());

        //crear instancia de clase persona
        Persona persona1 = new Persona();
    }
}
