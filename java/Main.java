import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String combinacao = scanner.nextLine();
        Tabuleiro jogo = new Tabuleiro(combinacao);
        jogo.PrintTabuleiro();
        System.out.print("\n");

        char[] movimentos = scanner.nextLine().toCharArray();
        scanner.close();

        for (char movimento : movimentos) {
            jogo.TrocarPecas(movimento);
            jogo.PrintTabuleiro();
            System.out.print("\n");
        }

        System.out.print("Posicao final: ");
        if(jogo.CombinacaoCorreta())
            System.out.print("true");
        else
            System.out.print("false");
    }
}
