/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo3.constructores;

/**
 *
 * @author omar
 */
public class Pelicula {
    private String titulo;
    private int duracion;

    /*
    public Pelicula(){
    titulo="no hay pelicula asignada";
    }
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    //constructor
    public Pelicula() {
    }
    ///este sirve para buscar
    public Pelicula(int duracion) {
        this.duracion = duracion;
    }
    
    
   
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
