/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo3.constructores;

/**
 *
 * @author T
 */
public class Contructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula p=new Pelicula("dracula",130);
       
        
        System.out.println(p.getTitulo());
        System.out.println(p.getDuracion());
        
    }
    
}
