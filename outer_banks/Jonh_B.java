/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outer_banks;

import java.util.Random;

class JohnB extends Personagens {
    public JohnB() {
        super("John B", 90, 15, 15, 15);
    }

    public String ataqueComArco(Personagens oponente) {
        int dano = this.forca + new Random().nextInt(11) + 10; // Random entre 10 e 20
        oponente.vida -= dano;
        return "John B ataca com seu arco improvisado, causando " + dano + " de dano!";
    }

    public String liderar() {
        int motivacao = new Random().nextInt(11) + 5; // Random entre 5 e 15
        return "John B usa sua liderança para aumentar a moral dos aliados em " + motivacao + " pontos!";
    }

    public String sobreviverAmbiente() {
        int vantagem = new Random().nextInt(6) + 5; // Random entre 5 e 10
        return "John B usa sua experiência de sobrevivência, ganhando uma vantagem de " + vantagem + " no combate!";
    }
}
