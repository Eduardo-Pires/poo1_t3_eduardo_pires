import java.time.LocalDate;

public class FigurinhaExtra
{
        private String nomeJogador;
        private LocalDate dataNascimento;
        private float altura;
        private float peso;
        private String posicao;
        private String pais;
        private String categoria;
        private String cor;

        public FigurinhaExtra(String pais)
        {
            this.pais = pais;
        }

        public FigurinhaExtra(String nomeJogador, String dataNascimento, float altura, float peso, String posicao, String pais, String categoria, String cor)
        {
            this.nomeJogador = nomeJogador;
            this.dataNascimento = LocalDate.parse(dataNascimento);
            this.altura = altura;
            this.peso = peso;
            this.posicao = posicao;
            this.pais = pais;
            this.categoria = categoria;
            this.cor = cor;
        }

        //funções set: são funções para alterar um atributo específico da figurinha
        public void setName(String nomeJogador)
        {
            this.nomeJogador = nomeJogador;
        }
        public void setbirthDate(String dataNascimento)
        {
            this.dataNascimento = LocalDate.parse(dataNascimento);
        }
        public void setHeight(float altura)
        {
            this.altura = altura;
        }
        public void setWeight(float peso)
        {
            this.peso = peso;
        }
        public void setPosition(String posicao)
        {
            this.posicao = posicao;
        }
        public void setCountry(String pais)
        {
            this.pais = pais;
        }

        public void setCategoria(String categoria)
        {
            this.categoria = categoria;
        }

        public void setCor(String cor)
        {
            this.cor = cor;
        }

        public float getAltura()
        {
            return altura;
        }

        public float getPeso()
        {
             return peso;
        }

       public LocalDate getDataNascimento()
       {
             return dataNascimento;
       }

        public String getCategoria()
        {
            return categoria;
        }

        public String getNomeJogador()
        {
            return nomeJogador;
        }

        public String getPais()
        {
            return pais;
        }

        public String getPosicao()
        {
            return posicao;
        }

        public String getCor()
        {
            return cor;
        }

    //mostra uma figurinha inteira
        public void MostrarFigurinha()
        {
            System.out.println("\n<<Informações do jogador " + nomeJogador + ">>");
            System.out.println("Nome: " + nomeJogador);
            System.out.println("Data de nascimento: " + dataNascimento);
            System.out.println("Altura: "+ altura);
            System.out.println("Peso: "+ peso);
            System.out.println("Posicao: "+ posicao);
            System.out.println("País: "+ pais);
            System.out.println("Categoria: "+ categoria);
            System.out.println("Cor: "+ cor);
        }

}
