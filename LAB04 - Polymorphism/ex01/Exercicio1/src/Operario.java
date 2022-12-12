import java.time.LocalDate;

public class Operario extends Funcionario
{
    private float producao;
    private int quantidadeProduzida;

    public Operario(String nome, LocalDate dataNascimento, float producao, int quantidadeProduzida)
    {
        super(nome, dataNascimento, (producao * quantidadeProduzida));
        this.producao = producao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public void calculaSalario()
    {
        setSalario(producao * quantidadeProduzida);
    }

    public float getProducao()
    {
        return producao;
    }

    public void setProducao(float producao)
    {
        this.producao = producao;
    }

    public float getQuantidadeProduzida()
    {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
}
