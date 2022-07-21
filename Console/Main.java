public class Main {

    public static void main(String[] args) {

        String[][] mat = new String[3][3];
        String formaJogador1, formaJogador2;

        Regras_Jogo.Imprime_Regras();
        formaJogador1 = Define_Forma_Jogador.Escolhe_Forma_Jogador_1();
        formaJogador2 = Define_Forma_Jogador.Escolhe_Forma_Jogador_2();
        Matriz.Matriz_Padrao(mat);// preenche a matriz com valores de 1 a 9
        Matriz.Imprime_Matriz(mat);

        do {
            Marcar_Posição.Escolhe_Posicao_Jogador_1(mat, formaJogador1, formaJogador2);
            Teste_Vencedor.Vencedor(mat);// testa se o jogador 1 fez uma linha
            Teste_Vencedor.Velha(mat);// testa se todos os espaços foram preenchidos
            Matriz.Imprime_Matriz(mat);

            // se o ganhou for igual a 0, significa que o jogador 1 não venceu o jogo
            // e se o contadorJogadas for diferente de 9, significa que ainda existem
            // espaços
            // a serem preenchidos.
            if (Teste_Vencedor.ganhou == 0 && Marcar_Posição.contadorJogadas != 9) {
                Marcar_Posição.Escolhe_Posicao_Jogador_2(mat, formaJogador1, formaJogador2);
                Teste_Vencedor.Vencedor(mat);// testa se o jogador 2 fez uma linha
                Teste_Vencedor.Velha(mat);// testa se todos os espaços foram preenchidos
                Matriz.Imprime_Matriz(mat);
            }
            // fim do if

        } while (Teste_Vencedor.ganhou < 1 && Marcar_Posição.contadorJogadas < 9);
        Menu_Pos_Jogo.Menu(mat, formaJogador1, formaJogador2);
    }
}
