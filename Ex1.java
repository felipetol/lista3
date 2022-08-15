/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;
/**
 *
 * @author felipetoledo
 */
public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            
            System.out.println("insira um número: ");
            num = sc.nextInt();
            
            if(num > 10 || num < 0) {
                System.out.println("valor inválido. intervalo válido entre 0 e 10");
            }
            
        } while(num > 10 || num < 0);
        
        System.out.println("valor válido: " + num);
    }
}
