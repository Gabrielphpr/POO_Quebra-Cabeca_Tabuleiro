# (POO) Quebra-Cabeça: Tabuleiro

Este projeto implementa um jogo de quebra-cabeça baseado em um tabuleiro que pode ser configurado em diferentes tamanhos (2x2, 3x3, 4x4). O objetivo é organizar as peças do tabuleiro na sequência correta, movendo-as através de comandos específicos.

A implementação está disponível em **Java** e **Python**, demonstrando conceitos básicos de Programação Orientada a Objetos (POO).

## Funcionalidades

O arquivo `Tabuleiro.java` define a lógica do tabuleiro e inclui as seguintes funcionalidades:

- **Inicializar Tabuleiro**: Define o tamanho do tabuleiro (2x2, 3x3 ou 4x4) com base na entrada inicial.
- **Exibir Tabuleiro**: Método `PrintTabuleiro()` para exibir o estado atual do tabuleiro no console.
- **Movimentar Peças**: Método `TrocarPecas(char movimento)` para mover as peças nas direções: 
  - `'u'` (para cima)
  - `'d'` (para baixo)
  - `'l'` (para a esquerda)
  - `'r'` (para a direita).
- **Verificar Solução**: Método `CombinacaoCorreta()` para validar se o tabuleiro está na sequência correta.

## Requisitos

- **Java**: Versão 8 ou superior.
- **Python**: Versão 3.6 ou superior, se quiser executar a implementação em Python.
