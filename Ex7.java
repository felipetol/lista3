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
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("insira um número: ");
            numeros[i] = sc.nextInt();
        }
        
        int maior = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println("maior: " + maior);
    }
}
