/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ficheros;

import java.util.Scanner;

/**
 *
 * @author DONALD
 */
public class Square {
    
    Scanner teclado = new Scanner(System.in);
    
    int n;
    
    public void InData(){
        System.out.print("Ingresa un número:");
        n=teclado.nextInt();
    }
    
    public void Estructura(){
        if (n>=2 && n<=50){
            for (int i=1; i<=n; i++){
                for (int j=1;j<=n;j++){
                System.out.print(" D ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Ingrese un numero entre 2 y 50");
        }
            
    }
    
    public static void main(String[] args) {
        Square fc= new Square();
        fc.InData();
        fc.Estructura();
    }
}
