import java.util.Scanner;

public class Marcar_Posição {

    static String posicao;
    static Scanner sc = new Scanner(System.in);
    static int testePosicao = 0, contadorJogadas = 0;

    public static String[][] Escolhe_Posicao_Jogador_1(String[][] mat, String formaJogador1, String formaJogador2) {
        System.out.println("-> JOGADOR 1, escolha onde quer colocar o -> " + formaJogador1);
        posicao = sc.nextLine();

        // laço duplo para percorrer a matriz.
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                // testa se o valor dado pelo usuário é igual a algum da matriz.
                if (posicao.equals(mat[i][j])) {

                    // testa se o valor dado já não está ocupado por um dos jogadores
                    if (!posicao.equals(formaJogador1) && !posicao.equals(formaJogador2)) {
                        mat[i][j] = formaJogador1;
                        testePosicao++;
                        contadorJogadas++;
                    } // fim do segundo if.

                } // fim do primeiro if.
            }
        } // fim do laço duplo.

        // se o testePosicao for igual a 0, significa que não entrou no segundo if,
        // logo a posição escolhida pelo usuário foi inválida.
        if (testePosicao == 0) {
            System.out.println("Posição inválida! Escolha outra.");

            // chama a si mesma para o jogador escolher outra posição.
            Escolhe_Posicao_Jogador_1(mat, formaJogador1, formaJogador2);

        } // fim do if.

        // zera o teste de posicao para o próximo teste.
        testePosicao = 0;
        return mat;
    }

    public static String[][] Escolhe_Posicao_Jogador_2(String[][] mat, String formaJogador1, String formaJogador2) {
        System.out.println("-> JOGADOR 2, escolha onde quer colocar o -> " + formaJogador2);
        posicao = sc.nextLine();

        // laço duplo para percorrer a matriz.
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                // testa se o valor dado pelo usuário é igual a algum da matriz.
                if (posicao.equals(mat[i][j])) {

                    // testa se o valor dado já não está ocupado por um dos jogadores.
                    if (!posicao.equals(formaJogador1) && !posicao.equals(formaJogador2)) {
                        mat[i][j] = formaJogador2;
                        testePosicao++;
                        contadorJogadas++;
                    } // fim do segundo if.

                } // fim do primeiro if.
            }
        } // fim do laço duplos.

        // se o testePosicao for igual a 0, significa que não entrou no segundo if,
        // logo a posição escolhida pelo usuário foi inválida.
        if (testePosicao == 0) {
            System.out.println("Posição inválida! Escolha outra.");

            // chama a si mesma para o jogador escolher outra posição.
            Escolhe_Posicao_Jogador_2(mat, formaJogador1, formaJogador2);

        } // fim do if.

        // zera o teste de posicao para o próximo teste.
        testePosicao = 0;
        return mat;
    }

}
