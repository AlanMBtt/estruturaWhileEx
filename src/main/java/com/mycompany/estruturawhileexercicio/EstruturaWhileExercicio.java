/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturawhileexercicio;
import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class EstruturaWhileExercicio {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            System.out.println("Digite um número: ");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0){
                System.out.println("O numero é zero");
            } else{
                if(numero > 0){
                    System.out.println("O numero é maior que zero");
                } else{
                    System.out.println("O numero é menor que zero");
                }
            }
            System.out.println("Deseja continuar?  S - sim / N - não");
            desejaContinuar = leitorScanner.next().charAt(0);
        }
        
        
        
    }
}
