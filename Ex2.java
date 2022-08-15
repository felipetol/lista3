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
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeUsuario = new String();
        String senhaUsuario = new String();
        
        System.out.println("insira o nome de usuário: ");
        nomeUsuario = sc.nextLine();
        
        do {
            System.out.println("insira a senha: ");
            senhaUsuario = sc.nextLine();
            
            if(senhaUsuario.equals(nomeUsuario)) {
                System.out.println("senha inválida. nome de usuário e senha iguais");
            }
            
        } while (senhaUsuario.equals(nomeUsuario));
    }
}
