import java.time.LocalDate;

public class Vendedor extends Funcionario
{
    private float comissao;
    private float vendas;
    private float valorFixo;

    public Vendedor(String nome, LocalDate dataNascimento, float valorFixo, float comissao, float vendas)
    {
        super(nome, dataNascimento, (valorFixo + comissao * vendas));
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public void calculaSalario()
    {
        setSalario(valorFixo + comissao * vendas);
    }

    public float getValorFixo()
    {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo)
    {
        this.valorFixo = valorFixo;
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

}
