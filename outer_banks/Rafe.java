/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outer_banks;

import java.util.Random;

class Rafe extends Personagens {
    public Rafe() {
        super("Rafe", 110, 25, 5, 15);
    }

    public String ataqueAgressivo(Personagens oponente) {
        int dano = this.forca + new Random().nextInt(11) + 15; // Random entre 15 e 25
        oponente.vida -= dano;
        return "Rafe realiza um ataque agressivo, causando " + dano + " de dano, mas perde um pouco de defesa!";
    }

    public String intimidacao(Personagens oponente) {
        boolean sucesso = new Random().nextBoolean();
        if (sucesso) {
            oponente.forca -= 5;
            return "Rafe intimida o oponente, reduzindo sua força temporariamente!";
        } else {
            return "Rafe tentou intimidar, mas o oponente resistiu.";
        }
    }

    public String recuperar() {
        int recuperacao = new Random().nextInt(11) + 10; // Random entre 10 e 20
        this.vida += recuperacao;
        return "Rafe recua e recupera " + recuperacao + " pontos de vida!";
    }
}