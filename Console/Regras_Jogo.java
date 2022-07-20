public class Regras_Jogo {

    public static void Imprime_Regras() {
        System.out.println("+--------------->[Guia]<--------------+");
        System.out.println("""
                1 - O primeiro a jogar ir\u00e1 escolher sua
                forma e a outra ser\u00e1 automaticamente
                designada ao segundo jogador.""");
        System.out.println("2 - Só são permitas as formas X ou O.");
        System.out.println("""
                3 - Para inserir sua forma em algum espa\u00e7o,
                basta digitar o n\u00famero do espa\u00e7o desejado.""");
        System.out.println("""
                4 - Ser\u00e3o inseridos: a forma que o jogador 1
                escolheu, depois do jogador 2 e assim recursivamente.""");
        System.out.println("""
                5 - O jogo acaba quando um dos jogadores
                formam uma linha com sua forma, ou quando todos os
                espa\u00e7os s\u00e3o preenchidos!\n\n""");

    }
}