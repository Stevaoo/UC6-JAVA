/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA01;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
import java.util.Scanner;
public class FRASE {
    public static void main(String[] args){
      //Cria u objeto para ler a entrada do usuario
      Scanner sc = new Scanner(System.in);
 
      /*
      System.out.println("Qual é frase do dia: ");
      frase = sc.nextLine();
      */
      
      System.out.println("Qual o meu nome:  ");
     String  nome = sc.nextLine();
      
      System.out.println("Qual é minha idade ?  ");
      int Idade = sc.nextInt();
      
       System.out.println("Qual é minha Altura ?  ");
      double Altura = sc.nextDouble();
    /*
      System.out.println("Frase do Dia: " + frase);
    */
    
    System.out.println(
            "\n Seu nome: " + nome + 
            "\n Sua Idade: " + Idade + 
            "\n Sua Altura: " + Altura );
    
    }
}

