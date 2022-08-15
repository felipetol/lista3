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
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome = new String();
        int idade = -1;
        double salario = -1;
        String sexo = new String();
        String estadoCivil = new String();
        
        boolean nomeInvalido = true;
        boolean idadeInvalida = true;
        boolean salarioInvalido = true;
        boolean sexoInvalido = true;
        boolean estadoCivilInvalido = true;
        
        do {
            if(nomeInvalido) {
                System.out.println("insira o nome: ");
                nome = sc.nextLine();
                nome = sc.nextLine();
            }
            
            if (nome.length() < 3) {
                System.out.println("nome inválido. número de caracteres precisa ser maior que 3.");
            } else {
                nomeInvalido = false;
            }
            
            
            if(idadeInvalida) {
                System.out.println("insira a idade: ");
                idade = sc.nextInt();
            }
            
            if(idade < 0 || idade > 150) {
                System.out.println("idade inválida. precisa ser entre 0 e 150.");
            } else {
               idadeInvalida = false;
            }
            
            
            if(salarioInvalido) {
                System.out.println("insira o salário: ");
                salario = sc.nextDouble();
            }
            
            if(salario < 0) {
                System.out.println("salário inválido. precisa ser maior que 0.");
            } else {
               salarioInvalido = false;
            }
            
            
            if(sexoInvalido) {
                System.out.println("insira o sexo: ");
                sexo = sc.nextLine();
                sexo = sc.nextLine();
            }
            
            if(!("f".equals(sexo)) || !("m".equals(sexo))) {
                System.out.println("sexo inválido. precisa ser 'f' ou 'm'");
            } else {
               sexoInvalido = false;
            }
            
            
            if(estadoCivilInvalido) {
                System.out.println("insira o estado civil: ");
                estadoCivil = sc.nextLine();
                estadoCivil = sc.nextLine();
            }
            
            if(!("s".equals(estadoCivil)) || !("c".equals(estadoCivil)) || !("v".equals(estadoCivil)) || !("d".equals(estadoCivil)) ) {
                System.out.println("estado civil inválido. precisa ser 's', 'c', 'v' ou 'd'");
            } else {
               estadoCivilInvalido = false;
            }
            
        } while(nome.length() < 3 && (idade < 0 || idade > 150) && salario < 0 && (!("f".equals(sexo)) || !("m".equals(sexo))) && (!("s".equals(estadoCivil)) || !("c".equals(estadoCivil)) || !("v".equals(estadoCivil)) || !("d".equals(estadoCivil))) );
    }
}
