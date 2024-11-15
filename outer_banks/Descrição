# Jogo de Batalha no Terminal

Este é um jogo de batalha simples, desenvolvido em Java, onde o usuário escolhe um personagem e enfrenta um oponente em uma batalha. Cada personagem possui habilidades especiais, ataques físicos e defesa, o que torna a batalha dinâmica e imprevisível. O jogo é baseado em turnos, com escolhas de ações como ataque, defesa, habilidades especiais ou fuga.

## Descrição

No jogo, o usuário pode escolher um dos seguintes personagens:

- **JJ**: Personagem focado em ataques físicos e força bruta.
- **Sarah**: Personagem com habilidades de persuasão e magia.
- **John B**: Personagem especializado em ataques com arco e liderança.
- **Rafe**: Personagem com força agressiva e habilidades de intimidar e recuperar.

Cada personagem tem atributos como `vida`, `forca`, `carisma` e `sobrevivencia`, que influenciam as ações e interações durante a batalha.

## Como Jogar

1. **Escolha seu personagem**: O usuário escolhe um personagem entre os quatro disponíveis.
2. **Escolha o oponente**: O usuário escolhe o oponente para a batalha.
3. **Realize ações**: Durante a batalha, o jogador pode escolher entre atacar, usar habilidades especiais, defender ou fugir.
4. **Final da batalha**: A batalha termina quando a vida de um dos personagens chega a zero. O vencedor é o último personagem com vida.

## Funcionamento

### Classes e Objetos

O código é estruturado em várias classes:

- **Classe `Personagem`**: Representa um personagem básico no jogo, com atributos `nome`, `vida`, `forca`, `carisma` e `sobrevivencia`. A classe também inclui o construtor que define esses valores.
- **Classes Filhas (`JJ`, `Sarah`, `JohnB`, `Rafe`)**: Estas classes herdam a classe `Personagem` e possuem métodos específicos que representam as habilidades e ataques especiais de cada personagem.

### Métodos e Funcionalidades

- **`Random`**: Utilizado para gerar valores aleatórios, como o dano causado nos ataques ou a chance de sucesso em habilidades especiais, como persuasão ou fuga. A função `new Random().nextInt(int)` é usada para gerar números aleatórios dentro de um intervalo definido.
  
  Exemplo de uso:
  ```java
  int dano = this.forca + new Random().nextInt(11) + 5; // Gera um valor entre 5 e 15
