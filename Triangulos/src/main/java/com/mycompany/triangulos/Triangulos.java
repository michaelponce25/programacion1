/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulos;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Triangulos {

    public static void main(String[] args) {

System.out.println("Bienvenido al Programa ");
           System.out.println("Ingrese una opcion valida");
           System.out.println("(1) Para Equilatero (2) Para Rectangulo ");
           Scanner scanner = new Scanner(System.in);
           int m = scanner.nextInt(); // m se asigna a la seleccion
           System.out.println("Ingrese La altura ");
           int n = scanner.nextInt(); // n es la variable que se asiga a altura
           
           switch (m){
               case 1:
                    for (int i = 0 ; i <= n ; i++ ){
                        for (int j = 0; j < n - i; j++) {
                            System.out.print(" ");}
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } 
                    break;
               case 2:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
           } 

    }
}
