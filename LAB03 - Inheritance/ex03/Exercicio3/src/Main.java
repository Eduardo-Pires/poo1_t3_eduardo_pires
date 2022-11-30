public class Main {
    public static void main(String[] args) {
        Figurinha jogador = new Figurinha("Bruno Basico", "2007-02-03", 1.90f, 70, "goleiro", "Brasil");
        FigurinhaExtra jogador1 = new FigurinhaExtra("Bruno Avançado", "2007-02-03", 1.90f, 70, "goleiro", "Brasil", "Legends", "ouro");
        FigurinhaExtra jogador2 = new FigurinhaExtra(jogador, "rookie", "bordô");

        jogador.MostrarFigurinha();
        jogador1.MostrarFigurinha();
        jogador2.MostrarFigurinha();
    }
}