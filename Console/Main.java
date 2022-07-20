public class Main {

    public static void main(String[] args) {

        String[][] mat = new String[3][3];
        String formaJogador1, formaJogador2;

        Regras_Jogo.Imprime_Regras();
        formaJogador1 = Define_Forma_Jogador.Escolhe_Forma_Jogador_1();
        formaJogador2 = Define_Forma_Jogador.Escolhe_Forma_Jogador_2();
        Matriz.Matriz_Padrao(mat);
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
        Menu_Pos_Jogo.Menu(mat, formaJogador1, formaJogador2);
    }
}
