
package HistoriaJogo;

import java.util.Scanner;

public class Arqueiro implements Personagem {
   // Atributos principais do personagem
    private String nome; // Nome do personagem
    private int forca;   // Atributo que influencia o dano causado
    private int vida;    // Representa os pontos de vida
    private int mana;    // Atributo utilizado para habilidades especiais
    private String arma; // Tipo de arma equipada

    public Arqueiro(String nome) {
        this.nome = nome;
        this.arma = "Nenhuma";
    }
 /**
     * Sorteia um valor para o atributo "forca" entre 7 e 12.
     * Solicita ao usuário que pressione ENTER para realizar o sorteio.
     */
  @Override
    public void sortearForca() {
        System.out.println("\nAperte ENTER para sortear a Força...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Aguarda o ENTER
        this.forca = (int) (Math.random() * 6) + 7; // Sorteia entre 7 e 12
        System.out.println("Força sorteada: " + this.forca);
    }

    @Override
    public void sortearVida() {
        System.out.println("\nAperte ENTER para sortear a Vida...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Aguarda o ENTER
        this.vida = (int) (Math.random() * 6) + 18; // Sorteia entre 18 e 23
        System.out.println("Vida sorteada: " + this.vida);
    }

    @Override
    public void sortearMana() {
        System.out.println("\nAperte ENTER para sortear a Mana...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Aguarda o ENTER
        this.mana = (int) (Math.random() * 4) + 8; // Sorteia entre 8 e 11
        System.out.println("Mana sorteada: " + this.mana);
    }


    //Mostra os atributos atuais do personagem.
    @Override
    public void mostrarAtributos() {
        System.out.println("Força: " + this.forca);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
        System.out.println("Arma equipada: " + this.arma);
    }

    //Retorna o valor da Força
    @Override
    public int getForca() {
        return this.forca;
    }
//Retorna o valor da Vida
    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getMana() {
        return this.mana;
    }
// Reduz o dano do personagem
    @Override
    public void receberDano(int dano) {
        this.vida -= dano;
    }
// O personagem equipa uma arma, no caso o arco que amumenta 6 de força 
    @Override
    public void usarArma(String tipoArma) {
        if (tipoArma.equals("Arco")) {
            this.forca += 6; // O arco aumenta a força em 6
            this.arma = "Arco";
            System.out.println("Você equipou o Arco! Força aumentada em 6.");
        }
    }

    // Opção de poção para o personagem recuperar a vida.
    @Override
    public void usarPoção(String tipoPoção) {
        if (tipoPoção.equals("Poção de Vida")) {
            this.vida += 10;
            System.out.println("Você usou uma Poção de Vida! Vida aumentada em 10.");
        } else if (tipoPoção.equals("Poção de Força")) {
            this.forca += 10;
            System.out.println("Você usou uma Poção de Força! Força aumentada em 10.");
        }
    }
}

