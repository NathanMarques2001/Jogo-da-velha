import java.util.Scanner;

public class Menu_Pos_Jogo {

    static int opcao;

    static Scanner sc = new Scanner(System.in);

    public static void Menu(String[][] mat, String formaJogador1, String formaJogador2) {
        System.out.println("\n----------->[ESCOLHA UMA OPÇÃO]<-----------");
        System.out.println("""
                1 - Reiniciar o jogo com as mesmas formas.
                2 - Reiniciar o jogo com novas formas.
                3 - Encerrar programa.""");
        opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            Teste_Vencedor.ganhou = 0;
            Marcar_Posição.contadorJogadas = 0;
            mat = Matriz.Matriz_Padrao(mat);
            Matriz.Imprime_Matriz(mat);
            do {
                Marcar_Posição.Escolhe_Posicao_Jogador_1(mat, formaJogador1, formaJogador2);
                Teste_Vencedor.Vencedor(mat);
                Teste_Vencedor.Velha(mat);
                Matriz.Imprime_Matriz(mat);
                if (Teste_Vencedor.ganhou == 0 && Marcar_Posição.contadorJogadas != 9) {
                    Marcar_Posição.Escolhe_Posicao_Jogador_2(mat, formaJogador1, formaJogador2);
                    Teste_Vencedor.Vencedor(mat);
                    Teste_Vencedor.Velha(mat);
                    Matriz.Imprime_Matriz(mat);
                }

            } while (Teste_Vencedor.ganhou < 1 && Marcar_Posição.contadorJogadas < 9);
            Menu(mat, formaJogador2, formaJogador2);
        }
        // fim da opcao 1

        if (opcao == 2) {
            Teste_Vencedor.ganhou = 0;
            Marcar_Posição.contadorJogadas = 0;
            formaJogador1 = Define_Forma_Jogador.Escolhe_Forma_Jogador_1();
            formaJogador2 = Define_Forma_Jogador.Escolhe_Forma_Jogador_2();
            mat = Matriz.Matriz_Padrao(mat);
            Matriz.Imprime_Matriz(mat);

            do {
                Marcar_Posição.Escolhe_Posicao_Jogador_1(mat, formaJogador1, formaJogador2);
                Teste_Vencedor.Vencedor(mat);
                Teste_Vencedor.Velha(mat);
                Matriz.Imprime_Matriz(mat);
                if (Teste_Vencedor.ganhou == 0 && Marcar_Posição.contadorJogadas != 9) {
                    Marcar_Posição.Escolhe_Posicao_Jogador_2(mat, formaJogador1, formaJogador2);
                    Teste_Vencedor.Vencedor(mat);
                    Teste_Vencedor.Velha(mat);
                    Matriz.Imprime_Matriz(mat);
                }

            } while (Teste_Vencedor.ganhou < 1 && Marcar_Posição.contadorJogadas < 9);
            Menu(mat, formaJogador2, formaJogador2);
        }
        // fim da opcao 2

        if (opcao == 3) {
            System.out.println("FIM DO PROGRAMA!");
            System.exit(0);
        }
        // fim da opcao 3

        if (opcao < 1 || opcao > 3) {
            System.out.println("OPÇÃO INVÁLIDA!");
            Menu(mat, formaJogador2, formaJogador2);
        }
    }
}
