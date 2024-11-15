// Arquivo: Main.java
package com.mycompany.outer_banks;


import java.util.Scanner;

public class Outer_Banks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        JJ jj = new JJ();
        Sarah sarah = new Sarah();
        JohnB  johnb = new JohnB();
        Rafe rafe = new Rafe();
        
        //Menu interativo da escolha dos personagens
          System.out.println("Bem-vindo ao jogo de batalha!");
        System.out.println("Escolha seu personagem:");
        System.out.println("1 - JJ");
        System.out.println("2 - Sarah");
        System.out.println("3 - John B");
        System.out.println("4 - Rafe");
        System.out.print("Escolha uma opção (1-4): ");
        int escolhaPersonagem = scanner.nextInt();
        Personagens jogador = null;
        
        switch (escolhaPersonagem) {
            case 1:
                jogador = jj;
         break;
            case 2:
                jogador = sarah;
         break;
            case 3:
                jogador = johnb;
         break;
            case 4:
                jogador = rafe;
                break;
            default:
                System.out.println("\"Opção inválida. Escolhendo JJ por padrão.");
                jogador = jj;
                break;
        }
        
        // Menu do Personagem escolhido
        System.out.println("Voce escolheu " + jogador.nome + "!");
        System.out.println("Prepare-se para a Procura do Tesouro/Batalha");
        
        //Escolhendo o oponente
        System.out.println("Escolha oponente:");
        System.out.println("1 - JJ");
        System.out.println("2 - Sarah");
        System.out.println("3 - John B");
        System.out.println("4 - Rafe");
        System.out.println("Escolha uma opcao (1-4): ");
        int escolhaOponente = scanner.nextInt();
        Personagens oponente = null;
        
        switch (escolhaOponente) {
            case 1:
                oponente = jj;
         break;
            case 2:
                oponente = sarah;
         break;
            case 3:
                oponente = johnb;
         break;
            case 4:
                oponente = rafe;
         break;
            default:
                System.out.println("Opção inválida. Escolhendo JJ por padrão.");
                oponente = jj;
                break;
        }
        

        // Início da batalha
        System.out.println("A batalha começou entre " + jogador.nome + " e " + oponente.nome + "!");
        boolean batalha = true;

        while (batalha) {
            System.out.println("\n" + jogador.nome + " vs " + oponente.nome);
            System.out.println(jogador.nome + " - Vida: " + jogador.vida + " | " + oponente.nome + " - Vida: " + oponente.vida);
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar Habilidade");
            System.out.println("3 - Defender");
            System.out.println("4 - Fugir");
            System.out.print("Escolha uma opção (1-4): ");
            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.println(jogador.nome + " realiza um ataque!");
                    if (jogador instanceof JJ) {
                        System.out.println(((JJ) jogador).ataqueFisicoJJ(oponente));
                    } else if (jogador instanceof Sarah) {
                        System.out.println(((Sarah) jogador).habilidadeMagica(oponente));
                    } else if (jogador instanceof JohnB) {
                        System.out.println(((JohnB) jogador).ataqueComArco(oponente));
                    } else if (jogador instanceof Rafe) {
                        System.out.println(((Rafe) jogador).ataqueAgressivo(oponente));
                    }
                    break;

                case 2:
                    System.out.println(jogador.nome + " usa uma habilidade especial!");
                    if (jogador instanceof JJ) {
                        System.out.println(((JJ) jogador).impulsividade());
                    } else if (jogador instanceof Sarah) {
                        System.out.println(((Sarah) jogador).usarPersuasao(oponente));
                    } else if (jogador instanceof JohnB) {
                        System.out.println(((JohnB) jogador).liderar());
                    } else if (jogador instanceof Rafe) {
                        System.out.println(((Rafe) jogador).intimidacao(oponente));
                    }
                    break;

                case 3:
                    System.out.println(jogador.nome + " se defende!");
                    if (jogador instanceof JJ) {
                        System.out.println(((JJ) jogador).resistirAtaque());
                    } else if (jogador instanceof Sarah) {
                        System.out.println(((Sarah) jogador).escaparRapidamente());
                    } else if (jogador instanceof JohnB) {
                        System.out.println(((JohnB) jogador).sobreviverAmbiente());
                    } else if (jogador instanceof Rafe) {
                        System.out.println(((Rafe) jogador).recuperar());
                    }
                    break;

                case 4:
                    System.out.println(jogador.nome + " tentou fugir da batalha!");
                    batalha = false;  // Termina a batalha
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            // Verificar se algum personagem foi derrotado
            if (oponente.vida <= 0) {
                System.out.println(oponente.nome + " foi derrotado! " + jogador.nome + " venceu!");
                batalha = false;
            } else if (jogador.vida <= 0) {
                System.out.println(jogador.nome + " foi derrotado! " + oponente.nome + " venceu!");
                batalha = false;
            }
        }

        scanner.close();
    }
}
