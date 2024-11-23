package Outer_Banks;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */


import java.util.Scanner;

public class Rafe extends Personagens {
    public Rafe() {
        super("Rafe", 110, 25, 12, 10);
    }

    public String ataqueAgressivo(Personagens oponente) {
        Dados dados = new Dados();
        int dano = this.forca + dados.rolarDados(new Scanner(System.in), 1, 8) + 12; // Random entre 12 e 20
        oponente.vida -= dano;
        return "Rafe faz um ataque agressivo, causando " + dano + " de dano!";
    }

    public String recuperar() {
        Dados dados = new Dados();
        int cura = dados.rolarDados(new Scanner(System.in), 1, 6) + 7; // Random entre 7 e 13
        this.vida += cura;
        return "Rafe recupera parte de sua vida, curando " + cura + " pontos!";
    }

    public String intimidacao(Personagens oponente) {
        Dados dados = new Dados();
        int sucesso = dados.rolarDados(new Scanner(System.in), 1, 6) + 6; // Random entre 6 e 12
        return "Rafe intimida " + oponente.nome + ", diminuindo sua força em " + sucesso + " pontos!";
    }
}

