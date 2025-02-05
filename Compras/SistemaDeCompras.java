/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
public class SistemaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Ver carrinho");
            System.out.println("4. Finalizar compra");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha um produto para adicionar:");
                    System.out.println("1. Iphone 15 - R$ 15000,00");
                    System.out.println("2. Camisa Grêmio ||| - R$ 300,00");
                    System.out.println("3. Pizza - R$ 40,00");
                    System.out.println("4. Livro Mente milionaria - R$ 80,00");
                    System.out.println("5. Carro do Mcqueen - R$ 60,00");
                    System.out.print("Digite o número do produto: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha) {
                        case 1: carrinho.add(new Eletronico("Iphone 15", 15000.00)); break;
                        case 2: carrinho.add(new Vestuario("Grêmio |||", 300.00)); break;
                        case 3: carrinho.add(new Alimento("Pizza", 40.00)); break;
                        case 4: carrinho.add(new Livro("Mente milionaria", 80.00)); break;
                        case 5: carrinho.add(new Brinquedo("Carro do Mcqueen", 60.00)); break;
                        default: System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio!");
                    } else {
                        System.out.println("\nProdutos no carrinho:");
                        for (int i = 0; i < carrinho.size(); i++) {
                            System.out.println((i + 1) + ". " + carrinho.get(i));
                        }
                        System.out.print("Digite o número do produto a remover: ");
                        int remover = scanner.nextInt();
                        if (remover > 0 && remover <= carrinho.size()) {
                            carrinho.remove(remover - 1);
                            System.out.println("Produto removido!");
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;
                case 3:
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio!");
                    } else {
                        System.out.println("\nCarrinho de compras:");
                        for (Produto p : carrinho) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 4:
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio! Adicione itens antes de finalizar a compra.");
                    } else {
                        double total = 0;
                        System.out.println("\nResumo da compra:");
                        for (Produto p : carrinho) {
                            System.out.println(p);
                            total += p.getPreco();
                        }
                        System.out.println("Total: R$ " + String.format("%.2f", total));
                        System.out.println("Compra finalizada! Obrigado por comprar conosco.");
                        carrinho.clear();
                    }
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Obrigado por usar o sistema de compras!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
