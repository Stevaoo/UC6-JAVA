/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA03;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
// Guerreiro.java
class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 90, 20);
    }

    public void atirarFlecha(Personagem oponente) {
        oponente.vida -= this.ataque;
        System.out.println(this.nome + " atirou uma flecha em " + oponente.nome + " e causou " + this.ataque + " de dano!");
    }
}
