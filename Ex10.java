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
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o primeiro numero do intervalo: ");
        int num1 = sc.nextInt();
        
        System.out.println("insira o segundo número do intervalo: ");
        int num2 = sc.nextInt();
        
        int maior = num1;
        int menor = num2;
        
        if(num2 > num1) {
            maior = num2;
            menor = num1;
        }
        
        System.out.println("números no intervalo");
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }
    }
}
