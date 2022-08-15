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
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double populacaoA = 80000;
        double populacaoB = 200000;
        
        int anosNecessarios = 0;
        
        while(populacaoA < populacaoB) {
            anosNecessarios++;
            populacaoA = populacaoA * 1.03;
            populacaoB = populacaoB * 1.015;
        }
        System.out.println("número de anos necessários: " + anosNecessarios);
    }
}
