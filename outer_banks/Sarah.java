package Outer_Banks;
import java.util.Scanner;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */

 public class Sarah extends Personagens {
    public Sarah() {
        super("Sarah", 90, 15, 20, 18);
    }

    public String habilidadeMagica(Personagens oponente) {
        Dados dados = new Dados();
        int dano = this.forca + dados.rolarDados(new Scanner(System.in), 1, 8) + 10; // Random entre 10 e 18
        oponente.vida -= dano;
        return "Sarah usa sua magia, causando " + dano + " de dano!";
    }

    public String escaparRapidamente() {
        Dados dados = new Dados();
        int esquiva = dados.rolarDados(new Scanner(System.in), 1, 6) + 10; // Random entre 10 e 15
        return "Sarah escapa rapidamente, esquivando-se de " + esquiva + " pontos de dano!";
    }

    public String usarPersuasao(Personagens oponente) {
        Dados dados = new Dados();
        int sucesso = dados.rolarDados(new Scanner(System.in), 1, 6) + 5; // Random entre 5 e 10
        return "Sarah usa persuasão para desestabilizar " + oponente.nome + ", aumentando sua vulnerabilidade em " + sucesso + "!";
    }
}

