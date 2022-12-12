import java.time.LocalDate;

public class Horista extends Funcionario
{
    private float valorHora;
    private int horasTrabalhadas;

    public Horista(String nome, LocalDate dataNascimento, float valorHora, int horasTrabalhadas)
    {
        super(nome, dataNascimento, (valorHora * horasTrabalhadas));
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calculaSalario()
    {
        setSalario(valorHora * horasTrabalhadas);
    }

    public float getValorHora()
    {
        return valorHora;
    }

    public void setValorHora(float valorHora)
    {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas()
    {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas)
    {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
