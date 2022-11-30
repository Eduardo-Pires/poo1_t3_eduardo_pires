import java.time.LocalDate;

public class Figurinha
{
    private String nomeJogador;
    private LocalDate dataNascimento;
    private String auxDataNascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    public Figurinha(){}

    public Figurinha(String pais)
    {
        this.pais = pais;
    }

    public Figurinha(String nomeJogador, String dataNascimento, float altura, float peso, String posicao, String pais)
    {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
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

    public String getNomeJogador()
    {
        return nomeJogador;
    }

    public LocalDate getDataNascimento()
    {
        return dataNascimento;
    }

    public String getAuxDataNascimento()
    {
        return auxDataNascimento;
    }

    public float getAltura()
    {
        return altura;
    }

    public float getPeso()
    {
        return peso;
    }

    public String getPosicao()
    {
        return posicao;
    }

    public String getPais()
    {
        return pais;
    }

    //dá opção ao usuário de setar todos os elementos em um único método
    public void setFigurinha(String nomeJogador, String dataNascimento, float altura, float peso, String posicao, String pais)
    {
            this.nomeJogador = nomeJogador;
            this.dataNascimento = LocalDate.parse(dataNascimento);
            this.auxDataNascimento = dataNascimento;
            this.altura = altura;
            this.peso = peso;
            this.posicao = posicao;
            this.pais = pais;
    }

    //os próximos 6 métodos imprimem elementos específicos da figurinha
    public void printName()
    {
        System.out.println("Nome: " + nomeJogador);
    }

    public void printBirthDate()
    {
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    public void printHeight()
    {
        System.out.println("Altura: "+ String.format("%.2f", altura));
    }

    public void printWeight()
    {
        System.out.println("Peso: "+ peso);
    }

    public void printPosition()
    {
        System.out.println("Posicao: "+ posicao);
    }

    public void printCountry()
    {
        System.out.println("País: "+ pais);
    }

    //mostra uma figurinha inteira
    public void MostrarFigurinha()
    {
        System.out.println("\n<<Informações do jogador " + nomeJogador + ">>");
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: "+ String.format("%.2f", altura));
        System.out.println("Peso: "+ peso);
        System.out.println("Posicao: "+ posicao);
        System.out.println("País: "+ pais);
    }

}

