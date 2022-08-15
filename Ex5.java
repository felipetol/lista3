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
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira a população A: ");
        double populacaoA = sc.nextDouble();
        
        System.out.println("inisra a taxa de crescimento da população A: ");
        double taxaCrescimentoA = sc.nextDouble();
        
        System.out.println("insira a população B: ");
        double populacaoB = sc.nextDouble();
        
        System.out.println("insira a taxa de crescimento da população B: ");
        double taxaCrescimentoB = sc.nextDouble();
        
        taxaCrescimentoA = taxaCrescimentoA / 100 + 1;
        taxaCrescimentoB = taxaCrescimentoB / 100 + 1;
        
        int anosNecessarios = 0;
        
        if (taxaCrescimentoA > taxaCrescimentoB) {
            while(populacaoA < populacaoB) {
                anosNecessarios++;
                populacaoA = populacaoA * 1.03;
                populacaoB = populacaoB * 1.015;
            }   
            System.out.println("número de anos necessários: " + anosNecessarios);
        } else {
            System.out.println("a população A não alcançará a população B.");
        }
        
        
    }
}
