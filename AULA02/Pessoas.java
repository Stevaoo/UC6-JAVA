/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA02;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
public class Pessoas {
    private String nome;
    private int idade;
    
    //Construtor
    public Pessoas(String nome, int Idade) {
        this.nome = nome;
        this.idade = Idade;
    }
    
    //Metodos
    public void apresentar (){
        System.out.println("Ola, Me Chamo " + nome + " e tenho " + idade + " anos ");
    }
   }
