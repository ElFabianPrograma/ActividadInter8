/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.Arrays;

/**
 *
 * @author Luis Fabian
 */
public class ArrayL {
    
public static int getNumero(int[] a, boolean b){
        
        if (b==true) {
            Arrays.sort(a);
            for (int i = 0; i <a.length; i++) {
                System.out.println(a[i]);    
            }
        }else{}
            if (b==false) {
                Arrays.sort(a);
                for (int i = a.length-1; i >=0 ; i--) {
                    System.out.println(a[i]);    
                }
            }
        return 0;
    }
    
}