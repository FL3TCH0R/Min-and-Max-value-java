/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.min_value_of_array;

/**
 *
 * @author fletc
 */
public class Min_value_of_array {

    public static void main(String[] args) {
         int [] array= new int [] {54, 12, 48, 71, 32};
        
        int max = array[0];
        
        for (int i=1; i < array.length; i++){
            if(array[i]<max)
            {
              max = array[i];
              System.out.println("The minimum value within the array is " + max);
            
            }
        }
            
        
        
        
        
        
    }
}
