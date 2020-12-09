/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer07;

import java.util.Scanner;

/**
 *
 * @author Patricia
 */
public class java {
    public static void main(String[] args){
        System.out.println("Entre com o preço do item:");
        Scanner scan = new Scanner(System.in );
        int valor
        valor = scan.nextInt();
                
             if (valor <= 10){ 
                 System.out.println("Pode comprar");
             } else if (valor > 10 && valor < 15){ 
                 System.out.println("Você pode pedir desconto");
             } else if (valor >= 15 && valor < 17){
                 System.out.println("Pode pesquisar mais");
             } else { // valor >= 17 
                 System.out.println("muito caro");
                 
                
    }
            

    
    }
}
    

