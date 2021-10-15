/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;



/**
 *
 * @author Luis Fabian
 */
public class Ejecutor {
    
    public static void main(String[] args) {
       
               
        Trabajadores empleado = new Empleado("Coordinador");
        imprimirTrabajador(empleado);
        
        Trabajadores docente = new Docente(40);
        imprimirTrabajador(docente);
        
    }
    
    public static void imprimirTrabajador(Trabajadores t){
        System.out.println("Sueldo: " + t.getSueldo());
        System.out.println("Bonificacion: " + t.getBonificacion());
        System.out.println("----------------------------------------");
    }
    
}      
        
        
       
        
        
    
    
    

