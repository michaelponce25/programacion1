/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Triangulos {
    
        public static void main(String[] args) {
           System.out.println("Bienvenido al Programa ");
           System.out.println("Ingrese una opcion valida");
           System.out.println("Presione (1) Para Equilatero (2) Para Rectangulo ");
           Scanner scanner = new Scanner(System.in);
           
           int m = scanner.nextInt(); // m se asigna a la seleccion
           int n = scanner.nextInt(); // n es la variable que se asiga a altura
           
           switch (m){
               case 1:
                    for (int i = 0 ; i <= n ; i++ ){
                    System.out.println("*");
                    } 
               case 2:
                
           } 
           
           
           
           
           
           }
            
            
            
        
    
    
}
