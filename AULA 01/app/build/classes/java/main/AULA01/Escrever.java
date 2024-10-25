/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA01;

import java.util.Scanner;
public class Escrever {
  public static void main(String[] args){
      //Cria u objeto para ler a entrada do usuario
      Scanner sc = new Scanner(System.in);
      
      //Declara duas variavies inteiras para armazenar os numeros digitados pelo usuario
      int numero1,numero2;
      String nome;
      
      //Solicita ao usuario que digite o primeiro numero
      System.out.println("Digite um numero:");
      numero1 = sc.nextInt(); // Lê o proximo inteiro digitado pelo usuario e o armazena em numero2
      
      //Solicita ao usuario que digite o segundo numero
      System.out.println("Digite um numero:");
      numero2 = sc.nextInt(); // Lê o proximo inteiro digitado pelo usuario e o armazena em numero2
      
      sc.nextLine();
      
      System.out.println("Digite seu nome:");
      nome = sc.nextLine();
      
      System.out.println("Aqui est o resultado," + nome + ":" + (numero1 + numero2));
  }    
}
