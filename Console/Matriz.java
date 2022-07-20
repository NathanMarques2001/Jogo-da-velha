public class Matriz {

    public static String[][] Matriz_Padrao(String[][] mat) {
        mat[0][0] = "1";
        mat[0][1] = "2";
        mat[0][2] = "3";
        mat[1][0] = "4";
        mat[1][1] = "5";
        mat[1][2] = "6";
        mat[2][0] = "7";
        mat[2][1] = "8";
        mat[2][2] = "9";

        return mat;
    }

    public static String[][] Imprime_Matriz(String[][] mat) {
        System.out.println("+-----------------+\n|  " + mat[0][0] + "  |  " + mat[0][1] + "  |  " + mat[0][2] + "  |");
        System.out.println("+-----------------+\n|  " + mat[1][0] + "  |  " + mat[1][1] + "  |  " + mat[1][2] + "  |");
        System.out.println("+-----------------+\n|  " + mat[2][0] + "  |  " + mat[2][1] + "  |  " + mat[2][2] + "  |");
        System.out.println("+-----------------+");

        return mat;
    }
}
