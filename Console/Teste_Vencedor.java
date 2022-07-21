public class Teste_Vencedor {

    static String vencedor;
    static int ganhou;

    public static String[][] Vencedor(String[][] mat) {
        // testa se a primeira linha tem as mesmas formas.
        if (mat[0][0].equalsIgnoreCase(mat[0][1]) && mat[0][1].equalsIgnoreCase(mat[0][2])) {
            vencedor = mat[0][0];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se a primeira coluna tem as mesmas formas.
        if (mat[0][0].equalsIgnoreCase(mat[1][0]) && mat[1][0].equalsIgnoreCase(mat[2][0])) {
            vencedor = mat[0][0];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se a segunda linha tem as mesmas formas.
        if (mat[1][0].equalsIgnoreCase(mat[1][1]) && mat[1][1].equalsIgnoreCase(mat[1][2])) {
            vencedor = mat[1][0];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se a segunda coluna tem as mesmas formas.
        if (mat[0][1].equalsIgnoreCase(mat[1][1]) && mat[1][1].equalsIgnoreCase(mat[2][1])) {
            vencedor = mat[0][1];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se a terceira linha tem as mesmas formas.
        if (mat[2][0].equalsIgnoreCase(mat[2][1]) && mat[2][1].equalsIgnoreCase(mat[2][2])) {
            vencedor = mat[2][0];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se a terceira coluna tem as mesmas formas.
        if (mat[0][2].equalsIgnoreCase(mat[1][2]) && mat[1][2].equalsIgnoreCase(mat[2][2])) {
            vencedor = mat[0][2];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se uma das diagonais tem as mesmas formas.
        if (mat[0][0].equalsIgnoreCase(mat[1][1]) && mat[1][1].equalsIgnoreCase(mat[2][2])) {
            vencedor = mat[0][0];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }

        // testa se a outra diagonal tem as mesmas formas.
        if (mat[2][0].equalsIgnoreCase(mat[1][1]) && mat[1][1].equalsIgnoreCase(mat[0][2])) {
            vencedor = mat[2][0];
            System.out.println("\nO " + vencedor + " ganhou! Parabéns!");
            ganhou++;
        }
        return mat;
    }

    public static void Velha(String[][] mat) {

        // se o contadorJogadas chega a 9, significa que todos os espaços na matriz
        // foram preenchidos
        if (Marcar_Posição.contadorJogadas == 9)
            System.out.println("\nDeu velha!");
    }
}
