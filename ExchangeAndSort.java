/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchangeandsort;

import java.util.Random;

/**
 *
 * @author kendrabooker
 */
public class ExchangeAndSort {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        Random r = new Random();
        //created array with 10 slots
        int[] arr = new int[10];
        int[] newArr = new int[10];
        //Stored random number from 1-100 in each random slot
        for(int i=0; i<arr.length; i++){
        
            for(int j=0; j< 1; j++){
            arr[i] += 1 + r.nextInt(99);
            
            }
         System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        //sorting Exchange sorting array
        int temp =0;
       for(int i=0; i<arr.length - 1; i++){
       
           for(int j=0; j<arr.length; j++){
           
               if(arr[i] < arr[j]){
               
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
           
       }
       
       //printing the array
       for(int i=0; i<arr.length; i++){
       
           System.out.print(arr[i] + " ");
       }
        
       
    
    }
}
