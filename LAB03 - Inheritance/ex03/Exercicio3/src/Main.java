public class Main {
    public static void main(String[] args) {
        Figurinha jogador = new Figurinha("Bruno", "2007-02-03", 1.90f, 70, "goleiro", "Brasil");
        FigurinhaExtra jogador1 = new FigurinhaExtra("Bruno", "2007-02-03", 1.90f, 70, "goleiro", "Brasil", "Legends", "ouro");

        jogador.MostrarFigurinha();
        jogador1.MostrarFigurinha();
    }
}