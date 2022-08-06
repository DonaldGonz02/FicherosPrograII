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
    
    public static void main(String[] args) {
        Square fc= new Square();
        fc.InData();
    }
}
