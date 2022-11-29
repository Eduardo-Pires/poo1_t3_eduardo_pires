import java.time.LocalDate;

public class FigurinhaExtra extends Figurinha
{
        private String categoria;
        private String cor;

        public FigurinhaExtra(String nomeJogador, String dataNascimento, float altura, float peso, String posicao, String pais, String categoria, String cor)
        {
            super(nomeJogador, dataNascimento, altura, peso, posicao, pais);
            this.categoria = categoria;
            this.cor = cor;
        }

        //funções set: são funções para alterar um atributo específico da figurinha

        public void setCategoria(String categoria)
        {
            this.categoria = categoria;
        }

        public void setCor(String cor)
        {
            this.cor = cor;
        }

        public String getCategoria()
        {
            return categoria;
        }

        public String getCor()
        {
            return cor;
        }

    //mostra uma figurinha inteira

        @Override
        public void MostrarFigurinha()
        {
            System.out.println("\n<<Informações do jogador " + nomeJogador + ">>");
            System.out.println("Nome: " + nomeJogador);
            System.out.println("Data de nascimento: " + dataNascimento);
            System.out.println("Altura: "+ String.format("%.2f", altura));
            System.out.println("Peso: "+ peso);
            System.out.println("Posicao: "+ posicao);
            System.out.println("País: "+ pais);
            System.out.println("Categoria: "+ categoria);
            System.out.println("Cor: "+ cor);
        }

}
