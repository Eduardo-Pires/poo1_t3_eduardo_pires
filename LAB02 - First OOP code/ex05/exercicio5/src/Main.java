public class Main {
    public static void main(String[] args) {
        Figurinha[] titulares1 = new Figurinha[11];

        for(int i = 0; i < titulares1.length; i++)
        {
            titulares1[i] = new Figurinha("Brasil");
        }

        Selecao selecao1 = new Selecao("Vasco", "Bruno Travencolo", titulares1);
    }
}