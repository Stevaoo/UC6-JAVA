// Arquivo: JJ.java
package com.mycompany.outer_banks;

import java.util.Random;

public class JJ extends Personagens { // Classe JJ herda Personagens

    public JJ() {
        super("JJ", 100, 20, 10, 15); // Atributos específicos de JJ
    }

    public String ataqueFisicoJJ(Personagens oponente) {
        int dano = this.forca + new Random().nextInt(11) + 5; // Random entre 5 e 15
        oponente.vida -= dano;
        return "JJ ataca com força bruta, causando " + dano + " de dano!";
    }
      public String resistirAtaque() {
        int reducao = new Random().nextInt(6) + 5; // Random entre 5 e 10
        return "JJ resiste ao ataque, reduzindo o dano em " + reducao + " pontos!";
    }

    public String impulsividade() {
        int aumentoDano = new Random().nextInt(11) + 10; // Random entre 10 e 20
        int reducaoDefesa = new Random().nextInt(6) + 5; // Random entre 5 e 10
        return "JJ entra em fúria, aumentando seu dano em " + aumentoDano + " e reduzindo sua defesa em " + reducaoDefesa + "!";
    }
}



