/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.max_value_of_array;

/**
 *
 * @author fletc
 */
public class Max_value_of_array {

    public static void main(String[] args) {
        int [] array = new int [] {23, 47, 39, 11, 64};
        
        int min = array[0];
        
        for (int i = 1; i < array.length; i++){
        if(array[i]>min)
        {
          min=array[i];
          System.out.println("The maximum value within the array is" + min);
        
        }
        
        
        }
        
        
        
        
    }
}
