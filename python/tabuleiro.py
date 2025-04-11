class tabuleiro:

    def __init__ (self, combinacao):

        self.combinacao = list(map(int, combinacao.split()))
        self.posicaoZero = self.combinacao.index(0)
        
        tam = len(self.combinacao)

        if tam == 4:
            self.tamanho = 2
        elif tam == 9:
            self.tamanho = 3
        elif tam == 16:
            self.tamanho = 4
        else:
            raise ValueError("combinacao incompativel")
    
    def printTabuleiro (self):


        for i in range(self.tamanho):
            print("+------" * self.tamanho + "+")
            for j in range(self.tamanho):
                index = (i * self.tamanho) + j
                if self.combinacao[index] > 9:
                    print("|  ", end="")
                else:
                    print("|   ", end="")
                print ("{}  ".format(self.combinacao[index]), end="")
            print("|")
            
        print("+------" * self.tamanho + "+")
    
    def trocarPecas (self, movimento):
        aux = self.posicaoZero

        if movimento == 'd' and self.posicaoZero >= self.tamanho:
            self.posicaoZero -= self.tamanho

        elif movimento == 'u' and self.posicaoZero <= self.tamanho*(self.tamanho-1):
            self.posicaoZero += self.tamanho
        
        elif movimento == 'r' and self.posicaoZero % self.tamanho != 0:
            self.posicaoZero -= 1

        elif movimento == 'l' and (self.posicaoZero + 1) % self.tamanho != 0:
            self.posicaoZero += 1

        self.combinacao[aux], self.combinacao[self.posicaoZero] = self.combinacao[self.posicaoZero], self.combinacao[aux]

    def combinacao_correta(self):
        for i in range(self.tamanho * self.tamanho):
            if i != self.combinacao[i]:
                return False
        return True

def main():
    combinacao = input()
    jogo = tabuleiro(combinacao)
    jogo.printTabuleiro()

    movimentos = input()
    for movimento in movimentos:
        jogo.trocarPecas(movimento)
        jogo.printTabuleiro()

    print("Posição final: ", end="")
    if jogo.combinacao_correta():
        print("true")
    else:
        print("false")


if __name__ == "__main__":
    main()