/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo1.abstraccion;

import com.capitulo1.abstraccion.*;
import com.capitulo2.encapsulamiento.Usuario;
import com.capitulo2.encapsulamiento.Pago;

/**
 *
 * @author campitos
 */
public class SistemaDePago {


    public static void main(String args[]){
 System.out.println(hacerPago(40,200));
    }
     public static float hacerPago(int horas, float sueldo){
        
        float pago=horas*sueldo;
    
        return pago;
        
    }
    
}
