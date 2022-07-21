import java.util.Scanner;

public class Define_Forma_Jogador {

    public static String formaJogador1, formaJogador2;
    public static final String formaX = "x", formaO = "o";
    static Scanner sc = new Scanner(System.in);

    public static String Escolhe_Forma_Jogador_1() {
        System.out.println("+-------->[ESCOLHA SUA FORMA]<--------+");
        System.out.println("Jogador 1, escolha sua forma -> X ou O");
        formaJogador1 = sc.nextLine();

        if (formaJogador1.equalsIgnoreCase(formaX))
            formaJogador1 = formaX;
        else
            formaJogador1 = formaO;

        return formaJogador1;
    }

    public static String Escolhe_Forma_Jogador_2() {
        if (formaJogador1.equals(formaX))
            formaJogador2 = formaO;
        else
            formaJogador2 = formaX;

        return formaJogador2;
    }
}
