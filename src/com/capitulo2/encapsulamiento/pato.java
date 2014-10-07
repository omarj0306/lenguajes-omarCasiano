/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo2.encapsulamiento;

/**
 *
 * @author T
 */
public class pato {
    private int id; 
   private int edad;
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    public void Hacercuac(String cuac) {
        System.out.println(cuac);
    }
  
  
  
}
