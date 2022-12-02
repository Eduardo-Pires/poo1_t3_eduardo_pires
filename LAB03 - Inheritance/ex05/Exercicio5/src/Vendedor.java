import java.time.LocalDate;

public class Vendedor extends Funcionario
{
    private float comissao;
    private float vendas;

    public Vendedor(String nome, LocalDate dataNascimento, float salario, float comissao, float vendas)
    {
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public void calculaSalario()
    {
        setSalario((getSalario() + comissao * vendas));
    }

    public void setComissao(float comissao)
    {
        this.comissao = comissao;
    }

    public void setVendas(float vendas)
    {
        this.vendas = vendas;
    }

    public float getComissao()
    {
        return comissao;
    }

    public float getVendas()
    {
        return vendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" + getSalario() +
                "comissao=" + comissao +
                ", vendas=" + vendas +
                '}';
    }
}
