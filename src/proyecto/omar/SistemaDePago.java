/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.omar;

/**
 *
 * @author campitos
 */
public class SistemaDePago {


    public static void main(String args[]){
        System.out.println(hacerPago(40,10));
    }
    
    public static float hacerPago(int horasTrabajadas, float sueldo){
        
        float pago=horasTrabajadas*sueldo;
        return pago;
    }
    
}
