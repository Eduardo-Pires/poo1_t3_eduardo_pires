public class Main {
    public static void main(String[] args)
    {
        Figurinha jog1, jog2,jog3;

        jog1 = new Figurinha();
        jog2 = new Figurinha();
        jog3 = new Figurinha();

        //Jogadores são instanciados na entrada
        jog1.alteraInfo(jog1);
        jog2.alteraInfo(jog2);
        jog3.alteraInfo(jog3);

        jog1.mostraInfo(jog1);
        jog2.mostraInfo(jog2);
        jog3.mostraInfo(jog3);

        /*
        jog1.nomeJogador = "Fausto Corrêa da Silva";
        jog1.dataNascimento = LocalDate.parse("1950-04-02");
        jog1.altura = 1.88f;
        jog1.pais = "Brazil";
        jog1.peso = 70;
        jog1.posicao = "apanhador";

        jog2.nomeJogador = "Lady Gaga";
        jog2.dataNascimento = LocalDate.parse("1986-03-28");
        jog2.altura = 1.55f;
        jog2.pais = "Estados Unidos da América";
        jog2.peso = 53;
        jog2.posicao = "Armadora";

        jog3.nomeJogador = "Nicolas Cage";
        jog3.dataNascimento = LocalDate.parse("1964-01-07");
        jog3.altura = 1.83f;
        jog3.pais = "USA";
        jog3.peso = 90;
        jog3.posicao = "Goleiro";
        */


    }
}