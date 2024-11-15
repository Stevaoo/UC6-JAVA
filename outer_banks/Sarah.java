/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outer_banks;

import java.util.Random; 

class Sarah extends Personagens {
    public Sarah() {
        super("Sarah", 80, 10, 20, 10);
    }

    public String usarPersuasao(Personagens oponente) {
        boolean sucesso = new Random().nextBoolean();
        if (sucesso) {
            oponente.vida -= 0;
            return "Sarah usa seu carisma para confundir o oponente, que hesita em atacar!";
        } else {
            return "Sarah tentou persuadir, mas falhou.";
        }
    }

    public String habilidadeMagica(Personagens oponente) {
        int danoMagico = new Random().nextInt(11) + 15; // Random entre 15 e 25
        oponente.vida -= danoMagico;
        return "Sarah usa sua habilidade mágica, causando " + danoMagico + " de dano!";
    }

    public String escaparRapidamente() {
        boolean sucesso = new Random().nextBoolean();
        if (sucesso) {
            return "Sarah conseguiu escapar da batalha!";
        } else {
            return "Sarah tentou escapar, mas não conseguiu.";
        }
    }
}

        

