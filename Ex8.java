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
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("insira um número");
            int num = sc.nextInt();
            soma += num;
        }
        
        System.out.println("soma: " + soma);
        System.out.println("média: " + soma / 5);
        
    }
}
