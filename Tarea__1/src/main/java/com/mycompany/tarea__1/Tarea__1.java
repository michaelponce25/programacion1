/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea__1;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Tarea__1 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido ");
            System.out.println("Ingrese el rango de donde quiere iniciar: ");
            int n = scanner.nextInt();
            System.out.println("Ingrese el final de su rango: ");
            int m = scanner.nextInt();
            
            for (int i = n ; i <= m ; i++){
                 if (i % 2 == 0){
                    System.out.println("Los numeros entre el rango son los siguientes ");
                    System.out.println("El numero " + i + " es par");
                 }else{
                    System.out.println("EL numero " + i + " es Impar");
                 }
                 
            }
            
            
            
            
    }
}
 