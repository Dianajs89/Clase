/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.argumentos_2;


public class Argumentos_2 {

    public static void main(String[] args) {
        
        String argumento0 = args [0];
        String argumento1 = args [1];
        
        int argumento1_numero =Integer.parseInt(argumento1);
        
        int num =1;
        
        
        for(int i=0;i<argumento1_numero;i++){
            System.out.println("producto " +num+":" + argumento0 +" " + i);
            num++;
            
        }
        
    }
}
