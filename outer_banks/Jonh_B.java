package Outer_Banks;
import java.util.Scanner;
/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
public class JohnB extends Personagens {
    public JohnB() {
        super("John B", 120, 18, 15, 12);
    }

    public String ataqueComArco(Personagens oponente) {
        Dados dados = new Dados();
        int dano = this.forca + dados.rolarDados(new Scanner(System.in), 1, 10) + 8; // Random entre 8 e 18
        oponente.vida -= dano;
        return "John B atira uma flecha, causando " + dano + " de dano!";
    }

    public String sobreviverAmbiente() {
        Dados dados = new Dados();
        int cura = dados.rolarDados(new Scanner(System.in), 1, 6) + 5; // Random entre 5 e 10
        this.vida += cura;
        return "John B usa suas habilidades de sobrevivência, curando " + cura + " de vida!";
    }

    public String liderar() {
        Dados dados = new Dados();
        int apoio = dados.rolarDados(new Scanner(System.in), 1, 6) + 8; // Random entre 8 e 14
        return "John B lidera a equipe, dando um bônus de " + apoio + " no próximo ataque!";
    }
}

