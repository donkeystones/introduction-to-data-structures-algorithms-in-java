/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction.to.data.structures.algorithms.in.java;

import java.util.Arrays;

/**
 *
 * @author Oscar Bäck
 */
public class BubbleSort {
    
    
    //This bubble sort was made with only my current knowledge and the basic concept
    //of bubble sort.
    public static int[] BubbleArraySort(int[] array){
        int pointer = array.length;//Pointer for the program to see where the array is sorted
        int placeholder = 0; //Temporary storage for moving of variables
        
        //As long as the pointer indicates that all variables are not sorted
        //Aka not equal to 0, then continue looping
        while(pointer != 0){
            for(int i = 0; i < pointer-1; i++){
                if(array[i] > array[i+1]){
                    placeholder = array[i];
                    array[i] = array[i+1];
                    array[i+1] = placeholder;
                }
                
            }
            pointer--;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    
    //Modified after looking through part analysis of algorithms
    public static int[] ModBubbleArraySort(int[] array){
        int placeholder = 0; 
        
        //Had to change so that instead of - 2 it had to be -1, otherwise the
        //last number in array would not have been sorted!
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    placeholder = array[j+1];
                    array[j+1] = array[j];
                    array[j] = placeholder;
                }
                
            }
        }
        return array;
    }
    
}
