public class Tabuleiro {
    private final int[] combinacao;
    private int posicaoZero;
    private int tamanho;

    public Tabuleiro(String combinacao) {

        String[] numeros = combinacao.split("\\s+");
        int comprimento = numeros.length;

        switch (comprimento) {
            case 4:
                this.tamanho = 2; // Tabuleiro 2x2
                break;
            case 9:
                this.tamanho = 3; // Tabuleiro 3x3
                break;
            case 16:
                this.tamanho = 4; // Tabuleiro 4x4
                break;
            default:
                throw new IllegalArgumentException("Combinação inválida");
        }

        this.combinacao = new int[comprimento];

        int i;
        for (i=0; i<comprimento; i++){
            this.combinacao[i] = Integer.parseInt(numeros[i]);
            if (this.combinacao[i] == 0){
                this.posicaoZero = i;
            }
        }
    }

    public void PrintTabuleiro(){
        int tam = (this.tamanho)*(this.tamanho);

        for (int i = 0; i < tam; i += this.tamanho) {
            System.out.println("+------".repeat(this.tamanho) + "+");
        
            for (int j = 0; j < this.tamanho; j++) {
                if(this.combinacao[i + j] > 9)
                    System.out.print("|  ");
                else
                    System.out.print("|   ");
                
                System.out.print(this.combinacao[i + j] + "  ");
            }
            System.out.println("|");
        }
        System.out.println("+------".repeat(this.tamanho) + "+");
    }

    public void TrocarPecas(char movimento){
        int i = this.posicaoZero;
        switch (movimento) {
            case 'd':
                if (this.posicaoZero < this.tamanho)
                    return;
                else
                    this.posicaoZero -= this.tamanho;
                break;

            case 'u':
                if (this.posicaoZero > (this.tamanho)*(this.tamanho - 1))
                    return;
                else
                    this.posicaoZero += this.tamanho;
                break;

            case 'r':
                if (this.posicaoZero % this.tamanho == 0 )
                    return;
                else
                    this.posicaoZero -= 1;
                break;

            case 'l':
                if ((this.posicaoZero + 1) % this.tamanho == 0 )
                    return;
                else
                    this.posicaoZero += 1;
                break;

            default:
                System.err.println("Caracter invalido");
                return;
        }

        int aux = this.combinacao[this.posicaoZero];
        this.combinacao[this.posicaoZero] = this.combinacao[i];
        this.combinacao[i] = aux;
    }

    public boolean CombinacaoCorreta(){
        for(int i=0; i<(this.tamanho)*(this.tamanho); i++){
            if (i != this.combinacao[i])
                return false;
        }
        return true;
    }
}
