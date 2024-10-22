package com.mycompany.escolhacaso;

import java.util.Scanner;
public class Escolhacaso {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um dia da semana(1-7)");
        
        int dia = leitor.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Domingo!");
                break;
                
            case 2:
                System.out.println("Segunda!");
                break;
                
            case 3:
                System.out.println("Terca!");
                break;
                
            case 4:
                System.out.println("Quarta!");
                break;
                
            case 5:
                System.out.println("Quinta!");
                break;
                
            case 6:
                System.out.println("Sexta!");
                break;
                
            case 7:
                System.out.println("Sabado!");
                break;
                
            default:
                System.out.println("nao existe mais de 7 dias!");
                break;
    }
}
}