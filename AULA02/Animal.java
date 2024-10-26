/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA02;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
public class Animal {
    private String nome;
    private String raça;
    private String tipo;
    
    public Animal(String nome, String raça, String tipo){
        this.nome = nome;
        this.raça = raça;
        this.tipo = tipo;
    }
        public void Zoologico(){
            System.out.println("Nome Do animal: " + nome + "," + " Raca Do animal: " + raça + ","+ " Tipo:  " + tipo );
        }
    }
    
