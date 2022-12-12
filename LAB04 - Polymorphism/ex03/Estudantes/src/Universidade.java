import java.time.LocalDate;

public class Universidade {
    private String nomeUniversidade;
    private LocalDate dataFundacao;
    private Estudante[] estudante;
    private int numEstudantes;

    public Universidade(String nomeUniversidade, LocalDate dataFundacao, Estudante[] estudante) {
        if(getNumEstudantes() > 100)
        {
            System.out.println("Erro, quantidade invalida de estudantes, universidade não criada.");
        }
        else
        {
            this.nomeUniversidade = nomeUniversidade;
            this.dataFundacao = dataFundacao;
            this.estudante = estudante;
        }
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        if(getNumEstudantes() > 100)
        {
            System.out.println("Erro, quantidade invalida de estudantes, operação não realizada.");
        }
        else
        {
            this.estudante = estudante;
        }
    }

    public void setNumEstudantes()
    {
        numEstudantes = estudante.length;
    }

    public int getNumEstudantes()
    {
        return numEstudantes;
    }

    public void printUniversidade()
    {
        for(int i = 0; i < estudante.length; i++)
        {
            if(estudante[i] instanceof EstudanteDoutorado)
            {
                System.out.println("nome: " + estudante[i].getNome());
                System.out.println("titulo tese: " + ((EstudanteDoutorado) estudante[i]).tituloTese);
                System.out.println("linha de pesquisa" + ((EstudanteDoutorado) estudante[i]).getLinhadDePesquisa());
            }
            else
            {
                System.out.println("nome: " + estudante[i].getNome());
            }
            System.out.println();
        }
    }
}
